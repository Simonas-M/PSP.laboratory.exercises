package com.simonas.psp.survey.data.entities;

import java.util.List;

public class Question {
    private String title;
    private List<String> choices;
    private String answer;

    public Question(String title, List<String> choices, int answerIndex) {
        this.title = title;
        this.choices = choices;
        this.answer = choices.get(answerIndex);
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
