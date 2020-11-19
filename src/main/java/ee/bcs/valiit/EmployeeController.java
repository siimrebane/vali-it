package ee.bcs.valiit;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    public List<Employee> employeeList = new ArrayList<>();

    @CrossOrigin
    @GetMapping("test_string")
    public String test(@RequestParam("test_string") String testString){
        return testString;
    }

    @CrossOrigin
    @GetMapping("test_employees")
    public List<Employee> getEmployee(){
        Employee employee1 = new Employee();
        employee1.setFirstName("Siim");
        employee1.setLastName("Rebane");
        Employee employee2 = new Employee();
        employee2.setFirstName("Someone");
        List<Employee> resultList = new ArrayList<>();
        resultList.add(employee1);
        resultList.add(employee2);
        return resultList;
    }

    @GetMapping("employee")
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    @PostMapping("employee")
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @GetMapping("employee/{id}")
    public Employee getEmployee(@PathVariable("employeeId") Integer id) {
        return employeeList.get(id);
    }
}
