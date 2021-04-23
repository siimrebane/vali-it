package ee.bcs.valiit.solution.hibernate;

public class SampleBookResponse {
    private Integer bookId;
    private String title;
    private String description;
    private String authorName;

    public SampleBookResponse(SampleBook sampleBook) {
        this.bookId = sampleBook.getId();
        this.title = sampleBook.getName();
        this.description = sampleBook.getDescription();
        this.authorName = sampleBook.getAuthor().getName();
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
