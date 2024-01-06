package com.supermoney.model.surveyform;

import com.supermoney.model.surveyform.question.Question;
import java.util.LinkedList;
import java.util.List;

public class Page {

    private final Integer id;
    private final List<Question> questions;

    public Page(Integer id) {

        this.id = id;
        this.questions = new LinkedList<>();
    }

    public void addQuestion(Question question) {

        this.questions.add(question);
    }
}
