package ee.bcs.valiit.repository3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    @Query(value = "SELECT a FROM Author a WHERE a.name = :midagi")
    List<Author> niceShortNameForFunction(@Param("midag") String midagi);
}
