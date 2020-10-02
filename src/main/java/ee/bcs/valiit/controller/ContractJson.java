package ee.bcs.valiit.controller;

import java.util.ArrayList;
import java.util.List;

public class ContractJson {
    private Integer number;
    private List<String> notes;

    public ContractJson() {
        number = 5;
        notes = new ArrayList<>();
        notes.add("1");
        notes.add("2");
        notes.add("3");
    }

    public Integer getNumber() {
        return number;
    }

    public ContractJson setNumber(Integer number) {
        this.number = number;
        return this;
    }

    public List<String> getNotes() {
        return notes;
    }

    public ContractJson setNotes(List<String> notes) {
        this.notes = notes;
        return this;
    }
}
