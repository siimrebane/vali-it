package ee.bcs.valiit.tasks.solution;

public class ResponseError {
    private String message;

    public String getMessage() {
        return message;
    }

    public ResponseError setMessage(String message) {
        this.message = message;
        return this;
    }
}
