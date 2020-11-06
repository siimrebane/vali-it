package ee.bcs.valiit;

import ee.bcs.valiit.tasks.Lesson2;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("test")
@RestController
public class TestController {
    List<Employee> employeeList = new ArrayList<>();

    @GetMapping("dto_test")
    public Employee getEmployee(){
        Employee e = new Employee();
        e.setFirstName("a");
        e.setLastName("b");
        return e;
    }

    @PostMapping("dto_test")
    public List<Employee> getEmployee2(@RequestBody Employee employee){
        employeeList.add(employee);
        Employee e = new Employee();
        e.setFirstName("Siim");
        e.setLastName("Rebane");
        employeeList.add(e);
        employeeList.stream().filter(e2 -> e2.getFirstName().equals("siim"));
        return employeeList;
    }


    @GetMapping("/fibonacci")
    public int test(@RequestParam("nr") int nr){
        return Lesson2.fibonacci(nr);
    }

    @GetMapping("ex2")
    public List<Integer> test2(@RequestParam("nr") int nr){
        List<Integer> resultList = new ArrayList<>();
        for(int i = 1; i <= nr; i++){
            System.out.println(i*2);
            resultList.add(i*2);
        }
        return resultList;
    }

    @GetMapping("table")
    public List multiplyinTable(@RequestParam("x") int x, int y){
        List<List<Integer>> result = new ArrayList<>();
        String stringResult = "";
        for(int i = 1; i <= x; i++){
            List<Integer> sisemineList = new ArrayList<>();
            for(int j = 1; j <= y; j++){
                sisemineList.add(i*j);
                if(i%2 == 0){
                    stringResult += "<b>";
                }
                stringResult += i*j + " ";
                if(i%2 == 0){
                    stringResult += "</b>";
                }
            }
            stringResult += "<br/>";
            result.add(sisemineList);
        }

        return result;
    }

    @GetMapping("abv")
    public Pair returStuff(){
        int a = 5;
        int b = 8;
        return new Pair(a, b);
    }

}
