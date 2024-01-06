package com.supermoney.model.surveyform;

import java.util.LinkedList;
import java.util.List;

public class SurveyForm {

    private final Integer id;

    private final List<Page> pages;

    public SurveyForm(Integer id) {

        this.id = id;
        this.pages = new LinkedList<>();
    }

    public void addPage(Page page) {

        this.pages.add(page);
    }

    public Integer getId() {

        return id;
    }
}
