package ee.bcs.valiit.tasks.solution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("solution/employee")
@RestController
public class SolutionEmployeeController {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    private List<SolutionEmployee> employeesList = new ArrayList<>();

    // http://localhost:8080/solution/employee/test?address=USA&name=John&age=24
    @GetMapping("test")
    public SolutionEmployee test(@RequestParam("name") String name,
                                 @RequestParam("age") int age,
                                 @RequestParam("address") String address) {
        SolutionEmployee employee = new SolutionEmployee();
        employee.setAddress(address);
        employee.setAge(age);
        employee.setName(name);
        return employee;
    }

    // http://localhost:8080/solution/employee/test
    @PostMapping("test")
    public void test2(@RequestBody SolutionEmployee employee){
        String sql = "INSERT INTO employee (name, address) VALUES (:nameParameter, :addressParameter)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("nameParameter", employee.getName());
        paramMap.put("addressParameter", employee.getAddress());
        jdbcTemplate.update(sql, paramMap);
    }

    @PostMapping("")
    public void addEmployee(@RequestBody SolutionEmployee employee){
        employeesList.add(employee);
    }

    @GetMapping("")
    public List<SolutionEmployee> getEmployees(){
        return employeesList;
    }

}
