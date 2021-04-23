package ee.bcs.valiit.solution.hibernate;


import javax.persistence.*;
import java.util.List;

@Table(name = "author")
@Entity
public class SampleAuthor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "author")
    private List<SampleBook> books;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SampleBook> getBooks() {
        return books;
    }

    public void setBooks(List<SampleBook> books) {
        this.books = books;
    }
}
