package com.supermoney.model.surveyform;

public abstract class User {

    private final Integer id;

    protected User(Integer id) {

        this.id = id;
    }

    public Integer getId() {

        return id;
    }
}
