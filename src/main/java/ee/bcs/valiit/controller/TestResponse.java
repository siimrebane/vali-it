package ee.bcs.valiit.controller;

public class TestResponse {
    private String status;

    public TestResponse(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
