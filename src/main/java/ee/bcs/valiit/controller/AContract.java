package ee.bcs.valiit.controller;

public class AContract {
    private Integer number;
    private String notes;

    public Integer getNumber() {
        return number;
    }

    public AContract setNumber(Integer number) {
        this.number = number;
        return this;
    }

    public String getNotes() {
        return notes;
    }

    public AContract setNotes(String notes) {
        this.notes = notes;
        return this;
    }
}
