package com.simonas.psp.survey.data.entity;

import java.util.List;
import java.util.UUID;

public class Question {
    private UUID id;
    private String title;
    private List<String> choices;
    private String answer;

    public Question(String title, List<String> choices, int answerIndex) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.choices = choices;
        this.answer = choices.get(answerIndex);
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getChoices() {
        return choices;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "Question{" +
            "title='" + title + '\'' +
            ", choices=" + choices +
            ", answer='" + answer + '\'' +
            '}';
    }
}
