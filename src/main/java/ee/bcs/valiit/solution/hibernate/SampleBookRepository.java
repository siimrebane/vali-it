package ee.bcs.valiit.solution.hibernate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SampleBookRepository extends JpaRepository<SampleBook, Integer> {
    SampleBook getByName(String name);

    // Kasuta Query annotatsiooni kui tahad ise SQL-i kirjutada
    //@Query(value = "SELECT * FROM name = :name", nativeQuery = true)
    List<SampleBook> findAllByNameContaining(String name);
}
