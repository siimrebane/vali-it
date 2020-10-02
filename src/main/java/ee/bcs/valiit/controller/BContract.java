package ee.bcs.valiit.controller;

import java.util.List;

public class BContract {
    private Integer number;
    private String note2;
    private List<String> notes;

    public Integer getNumber() {
        return number;
    }

    public BContract setNumber(Integer number) {
        this.number = number;
        return this;
    }

    public List<String> getNotes() {
        return notes;
    }

    public BContract setNotes(List<String> notes) {
        this.notes = notes;
        return this;
    }
}
