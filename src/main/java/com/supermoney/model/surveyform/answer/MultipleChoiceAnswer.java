package com.supermoney.model.surveyform.answer;

import java.util.List;

public class MultipleChoiceAnswer extends Answer {

    private final List<String> selectedChoices;


    public MultipleChoiceAnswer(Integer questionId, List<String> selectedChoices) {

        super(questionId);
        this.selectedChoices = selectedChoices;
    }

    @Override
    public String toString() {

        return selectedChoices.toString();
    }
}
