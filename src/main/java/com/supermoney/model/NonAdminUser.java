package com.supermoney.model;

import com.supermoney.model.surveyform.User;
import com.supermoney.model.surveyform.answer.Answer;
import java.util.HashMap;
import java.util.Map;

public class NonAdminUser extends User {

    private final Map<Integer, Map<Integer, Answer>> formWiseAnswerSubmitted;

    public NonAdminUser(Integer id) {

        super(id);
        formWiseAnswerSubmitted = new HashMap<>();
    }

    public void saveAnswer(Integer formId, Integer questionId, Answer answer) {

        if (!formWiseAnswerSubmitted.containsKey(formId)) {
            formWiseAnswerSubmitted.put(formId, new HashMap<>());
        }

        formWiseAnswerSubmitted.get(formId).put(questionId, answer);
    }

    public Map<Integer, Answer> previewResponseProvideTillNow(Integer formId) {

        return formWiseAnswerSubmitted.get(formId);
    }
}
