package com.example.quizapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        int score = getIntent().getIntExtra("score", 0);
        int totalQuestions = getIntent().getIntExtra("totalQuestions", 0);

        TextView scoreTextView = findViewById(R.id.scoreTextView);
        TextView totalQuestionsTextView = findViewById(R.id.totalQuestionsTextView);
        Button backToQuizButton = findViewById(R.id.backToQuizButton);

        // Display the score and total questions answered
        scoreTextView.setText("Your Score: " + score);
        totalQuestionsTextView.setText("Total Questions Answered: " + totalQuestions);

        // Add a click listener to the "Back to Quiz" button
        backToQuizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate back to the MainActivity
                finish(); // Close the ResultActivity
            }
        });
    }
}