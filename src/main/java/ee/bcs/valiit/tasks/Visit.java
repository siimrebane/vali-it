package ee.bcs.valiit.tasks;

public class Visit {
    private String date;
    private int visits;

    public Visit(String date, int visits) {
        this.date = date;
        this.visits = visits;
    }

    public String getDate() {
        return date;
    }

    public Visit setDate(String date) {
        this.date = date;
        return this;
    }

    public int getVisits() {
        return visits;
    }

    public Visit setVisits(int visits) {
        this.visits = visits;
        return this;
    }
}
