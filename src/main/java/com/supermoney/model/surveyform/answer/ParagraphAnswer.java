package com.supermoney.model.surveyform.answer;

public class ParagraphAnswer extends Answer {

    private final String text;

    public ParagraphAnswer(Integer questionId, String text) {

        super(questionId);
        this.text = text;
    }

    @Override
    public String toString() {

        return text;
    }
}
