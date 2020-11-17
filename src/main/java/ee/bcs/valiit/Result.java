package ee.bcs.valiit;

public class Result {
    private String test;
    public Result(String test) {
        this.test = test;
    }

    public String getTest() {
        return test;
    }

    public Result setTest(String test) {
        this.test = test;
        return this;
    }
}
