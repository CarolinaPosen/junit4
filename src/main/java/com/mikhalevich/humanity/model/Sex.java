package com.mikhalevich.humanity.model;

public enum Sex {
    MALE ("MALE"),
    FEMALE ("FEMALE");

    private String title;

    Sex(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Sex{" +
                "title='" + title + '\'' +
                '}';
    }

}
