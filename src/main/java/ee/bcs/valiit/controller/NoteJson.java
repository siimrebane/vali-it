package ee.bcs.valiit.controller;

import java.util.ArrayList;
import java.util.List;

public class NoteJson extends Notes {
    private List<String> notes;

    public NoteJson() {
        notes = new ArrayList<>();
        notes.add("1");
        notes.add("2");
        notes.add("3");
    }
}
