package ee.bcs.valiit;

import ee.bcs.valiit.repository3.Author;

public class AuthorResponse {
    private Integer id;
    private String name;
    private Integer bookCount;

    public AuthorResponse(Author author) {
        this.id = author.getId();
        this.name = author.getName();
        this.bookCount = author.getBooks().size();
    }

    public Integer getId() {
        return id;
    }

    public AuthorResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AuthorResponse setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getBookCount() {
        return bookCount;
    }

    public AuthorResponse setBookCount(Integer bookCount) {
        this.bookCount = bookCount;
        return this;
    }
}
