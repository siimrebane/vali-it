package ee.bcs.valiit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {
    public List<Employee> employeeList = new ArrayList<>();

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
