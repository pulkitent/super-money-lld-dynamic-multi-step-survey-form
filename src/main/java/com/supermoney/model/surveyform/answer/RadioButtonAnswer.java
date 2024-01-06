package com.supermoney.model.surveyform.answer;

public class RadioButtonAnswer extends Answer {

    private final String selectedChoice;

    public RadioButtonAnswer(Integer questionId, String selectedChoice) {

        super(questionId);
        this.selectedChoice = selectedChoice;
    }

    @Override
    public String toString() {

        return selectedChoice;
    }
}
