package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.quizapp.models.GetQuestions;
import com.example.quizapp.models.Question;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Question> questions;
    private int currentQuestionIndex = 0;
    private int score = 0;
    private int answeredQuestions = 0;

    private TextView questionTextView;
    private RadioGroup optionsRadioGroup;
    private Button nextButton;
    private TextView progressTextView;

    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getPreferences(MODE_PRIVATE);

        GetQuestions getQuestions = new GetQuestions();
        // Retrieve questions from SharedPreferences or get a new set
        questions = getSavedQuestions();

        System.out.println(savedInstanceState == null);
        if (preferences != null){
            // If saved instance state is available, use the saved state
            currentQuestionIndex = preferences.getInt("currentQuestionIndex", 0);
            System.out.println(currentQuestionIndex);
            score = preferences.getInt("score",0 );
            answeredQuestions = preferences.getInt("answeredQuestions", 0);
        }
        initializeViews();

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validateAnswer()) {
                    checkAnswer();
                    currentQuestionIndex++;
                    if (currentQuestionIndex < questions.size()) {
                        updateQuestion();
                    } else {
                        showResults();
                        resetQuiz();
                    }
                }
            }
        });
    }

    private void initializeViews() {
        questionTextView = findViewById(R.id.questionTextView);
        optionsRadioGroup = findViewById(R.id.optionsRadioGroup);
        nextButton = findViewById(R.id.nextButton);
        progressTextView = findViewById(R.id.progressTextView);

        updateQuestion();
    }

    private void updateQuestion() {
        Question currentQuestion = questions.get(currentQuestionIndex);

        questionTextView.setText(currentQuestion.getQuestion());

        optionsRadioGroup.removeAllViews();

        for (int i = 0; i < currentQuestion.getOptions().length; i++) {
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText(currentQuestion.getOptions()[i]);
            radioButton.setId(i);
            optionsRadioGroup.addView(radioButton);
        }

        progressTextView.setText("Progress: " + (currentQuestionIndex) + "/" + questions.size());
    }

    private boolean validateAnswer() {
        int selectedRadioButtonId = optionsRadioGroup.getCheckedRadioButtonId();
        return selectedRadioButtonId >=0 && selectedRadioButtonId<4;
    }

    private void checkAnswer() {
        int selectedRadioButtonId = optionsRadioGroup.getCheckedRadioButtonId();
        if (selectedRadioButtonId != -1) {
            RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);
            int selectedAnswer = selectedRadioButton.getId();

            if (selectedAnswer == questions.get(currentQuestionIndex).getCorrectAns()) {
                score++;
            }
            answeredQuestions++;
        }
    }

    private void resetQuiz() {
        GetQuestions getQuestions = new GetQuestions();
        questions = getQuestions.getRandomQuestions();
        currentQuestionIndex = 0;
        score = 0;
        answeredQuestions = 0;

        // Clear saved preferences
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear();
        editor.apply();

        updateQuestion();
    }

    private void showResults() {
        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        intent.putExtra("score", score);
        intent.putExtra("totalQuestions", answeredQuestions);
        startActivity(intent);
        resetQuiz();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("currentQuestionIndex", currentQuestionIndex);
        outState.putInt("score", score);
        outState.putInt("answeredQuestions", answeredQuestions);
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("currentQuestionIndex", currentQuestionIndex);
        editor.putInt("score", score);
        editor.putInt("answeredQuestions", answeredQuestions);

        // Save the user's selection
        int selectedRadioButtonId = optionsRadioGroup.getCheckedRadioButtonId();
        editor.putInt("selectedOption", selectedRadioButtonId);

        saveQuestions(questions, editor);

        editor.apply();
    }

    private void saveQuestions(List<Question> questions, SharedPreferences.Editor editor) {
        Gson gson = new Gson();
        String json = gson.toJson(questions);
        editor.putString("questions", json);
    }

    private List<Question> getSavedQuestions() {

        if(preferences.contains("questions")) {
            Gson gson = new Gson();
            String json = preferences.getString("questions", null);
            Type type = new TypeToken<List<Question>>() {
            }.getType();
            return gson.fromJson(json, type);
        }
        else
            return new GetQuestions().getRandomQuestions();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("currentQuestionIndex", currentQuestionIndex);
        editor.putInt("score", score);
        editor.putInt("answeredQuestions", answeredQuestions);

        // Save the user's selection
        int selectedRadioButtonId = optionsRadioGroup.getCheckedRadioButtonId();
        editor.putInt("selectedOption", selectedRadioButtonId);

        saveQuestions(questions, editor);

        editor.apply();
    }
}