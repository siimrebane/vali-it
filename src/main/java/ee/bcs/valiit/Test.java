package ee.bcs.valiit;

import ee.bcs.valiit.controller.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class Test {

    public static void main(String[] args) {
        System.out.println(reverse("tere"));
        System.out.println(secondLetter("abcdef"));
        System.out.println(secondLetter2("abcdef"));
    }

    public static String reverse(String a){
        String result = "";
        for (int i = a.length(); i > 0; i--){
             result += a.substring(i-1, i);
        }
        return result;
    }

    public static String secondLetter(String a){
        String result = "";
        for (int i = 0; i < a.length(); i++){
            if(i%2 == 0){
                result += a.substring(i, i+1);
            }
        }
        return result;
    }

    public static String secondLetter2(String a){
        String result = "";
        for(int i = 0; i < a.length(); i = i + 2){
            result += a.substring(i, i+1);
        }
        return result;
    }

    // PUT /employee/12
    @PutMapping("employee/{id}")
    public String updateEmployee(@RequestBody Employee employee, @PathVariable("id") Long id){
        return "";
    }

    @GetMapping("employee")
    public String getEmployee(@RequestParam("name") String name, @RequestParam("age") int age){
        return "";
    }

    public static int test(){
        try{
            return 1;
        } finally {
            return 2;
        }
    }

    public static int pindala(int a, int b){
        return Math.abs(a) * Math.abs(b);
    }

    public static int ümbermõõt(int a, int b){
        return 2*(Math.abs(a)+Math.abs(b));
    }

    public static int yl5(int input){
        if(input >= 1 && input <= 2019){
            input--;
            return input/100 + 1;
        } else {
            throw new RuntimeException("EI TEE!");
        }
    }
    String sql1 = "SELECT * FROM employee WHERE id = 5";
    String sql2 = "INSERT INTO employee (name, address) VALUES ('name', 'address')";

}


