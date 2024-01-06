package com.supermoney.model.surveyform.answer;

public abstract class Answer {

    private final Integer questionId;

    protected Answer(Integer questionId) {

        this.questionId = questionId;
    }
}
