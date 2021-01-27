package ee.bcs.valiit.tasks.solution.repository;

import ee.bcs.valiit.tasks.solution.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SolutionEmployee2Repository extends JpaRepository<Employee, Integer> {
    List<Employee> findByNameContainingIgnoreCase(String name);
}
