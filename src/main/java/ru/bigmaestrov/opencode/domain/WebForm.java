package ru.bigmaestrov.opencode.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WebForm {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String answer;
    private int numButtons;

    public WebForm() {
    }

    public WebForm(String answer, int numButtons) {
        this.answer = answer;
        this.numButtons = numButtons;
    }

    public void setAnswer(String text) {
        this.answer = text;
    }

    public String getAnswer() {
        return answer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumButtons() {
        return numButtons;
    }

    public void setNumButtons(int tag) {
        this.numButtons = tag;
    }
}
