package ee.bcs.valiit.tasks.solution.controller;
import ee.bcs.valiit.tasks.solution.Employee;
import ee.bcs.valiit.tasks.solution.repository.SolutionEmployee2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("solution/hibernate")
@RestController
public class SolutionHibernateController {

    @Autowired
    private SolutionEmployee2Repository employeeRepository;

    @Transactional
    @GetMapping("test")
    public List<Employee> test(String name){
        List<Employee> employees = employeeRepository.findByNameContainingIgnoreCase(name); // SELECT * FROM employees
        return employees;
    }

}
