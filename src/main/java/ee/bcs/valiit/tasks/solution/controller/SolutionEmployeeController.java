package ee.bcs.valiit.tasks.solution.controller;

import ee.bcs.valiit.tasks.solution.SolutionEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.sql.SQLException;
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

    // http://localhost:8080/solution/employee/name?id=2
    @GetMapping("name")
    public String addEmployee(int id){
        String sql = "SELECT name FROM employee WHERE id = :idParam";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("idParam", id);
        return jdbcTemplate.queryForObject(sql, paramMap, String.class);
    }

    // http://localhost:8080/solution/employee
    @GetMapping()
    public List<SolutionEmployee> getEmployees(){
        String sql = "SELECT * FROM employee";
        List<SolutionEmployee> result = jdbcTemplate.query(sql, new HashMap<>(), new SolutionEmployeeRowMapper());
        return result;
    }

    private class SolutionEmployeeRowMapper implements RowMapper<SolutionEmployee> {
        @Override
        public SolutionEmployee mapRow(ResultSet resultSet, int i) throws SQLException {
            SolutionEmployee employee = new SolutionEmployee();
            employee.setName(resultSet.getString("name"));
            employee.setAddress(resultSet.getString("address"));
            employee.setId(resultSet.getInt("id"));
            return employee;
        }
    }
}
