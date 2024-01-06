package com.supermoney.model.surveyform.question;

import java.util.LinkedList;
import java.util.List;

public class RadioButtonQuestion extends Question {

    private final List<String> choices;

    public RadioButtonQuestion(Integer id, String text, QuestionType questionType) {

        super(id, text, questionType);
        this.choices = new LinkedList<>();
    }

    @Override
    public void addChoices(String choice) {

        this.choices.add(choice);

    }
}
