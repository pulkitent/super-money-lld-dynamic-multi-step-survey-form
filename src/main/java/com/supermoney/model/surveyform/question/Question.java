package com.supermoney.model.surveyform.question;

public abstract class Question {

    private final Integer id;
    private final String text;

    private final QuestionType questionType;

    Question(Integer id, String text, QuestionType questionType) {

        this.id = id;
        this.text = text;
        this.questionType = questionType;
    }

    public void addChoices(String choice) {

    }

    public Integer getId() {

        return id;
    }
}
