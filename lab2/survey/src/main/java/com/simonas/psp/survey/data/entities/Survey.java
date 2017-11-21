package com.simonas.psp.survey.data.entities;

import java.util.List;
import java.util.UUID;

public class Survey {
    private UUID id;
    private String title;
    private List<Question> questions;

    public Survey(String title, List<Question> questions) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.questions = questions;
    }

    public UUID getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    @Override
    public String toString() {
        return "Survey{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", questions=" + questions +
            '}';
    }
}
