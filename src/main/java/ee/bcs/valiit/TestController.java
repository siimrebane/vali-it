package ee.bcs.valiit;

import ee.bcs.valiit.exception.ApplicationException;
import ee.bcs.valiit.respository2.AccountRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("test")
@RestController
public class TestController {
    @Autowired
    private AccountRepository2 accountRepository2;

    List<Employee> employeeList = new ArrayList<>();

    @GetMapping("excption_test")
    public int exceptionTest(Integer i){
        return fib(i);
    }
    private int fib(Integer i) {
        if (i < 1) {
            throw new ApplicationException("i peab olema suurem kui 0");
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        return fib(i-1) + fib(i-2);
    }
}
