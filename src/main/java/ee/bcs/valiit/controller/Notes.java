package ee.bcs.valiit.controller;

import java.util.List;

public class Notes {
    private List<String> notes;

    public List<String> getNotes() {
        return notes;
    }

    public Notes setNotes(List<String> notes) {
        this.notes = notes;
        return this;
    }
}
