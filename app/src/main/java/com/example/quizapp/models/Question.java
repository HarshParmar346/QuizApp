package com.example.quizapp.models;

public class Question {

    public String question;
    public String[] options;
    public int correctAns;

    public Question(String question, String[] options, int correctAns) {
        this.question = question;
        this.options = options;
        this.correctAns = correctAns;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public int getCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(int correctAns) {
        this.correctAns = correctAns;
    }
}
