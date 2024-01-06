package com.supermoney.model;

import com.supermoney.model.surveyform.Page;
import com.supermoney.model.surveyform.SurveyForm;
import com.supermoney.model.surveyform.User;
import com.supermoney.model.surveyform.question.Question;

public class AdminUser extends User {

    public AdminUser(Integer id) {

        super(id);
    }

    public void addQuestionToGivenPage(Question question, Page page) {

        page.addQuestion(question);
    }

    public void addPageToGivenForm(Page page, SurveyForm surveyForm) {

        surveyForm.addPage(page);
    }
}
