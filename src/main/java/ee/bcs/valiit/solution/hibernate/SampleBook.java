package ee.bcs.valiit.solution.hibernate;

import javax.persistence.*;

@Table(name = "book")
@Entity
public class SampleBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private String name;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private SampleAuthor author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SampleAuthor getAuthor() {
        return author;
    }

    public void setAuthor(SampleAuthor author) {
        this.author = author;
    }
}
