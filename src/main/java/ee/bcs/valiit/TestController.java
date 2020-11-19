package ee.bcs.valiit;

import ee.bcs.valiit.exception.ApplicationException;
import ee.bcs.valiit.respository2.AccountRepository2;
import ee.bcs.valiit.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("test")
@RestController
public class TestController {

    private AccountRepository2 accountRepository2;
    private AccountService accountService;

    public TestController(AccountRepository2 accountRepository2,
                          AccountService accountService) {
        this.accountRepository2 = accountRepository2;
        this.accountService = accountService;
    }

    @CrossOrigin
    @PostMapping("register")
    public List<User> register(@RequestBody User user){
        System.out.println(user);
        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(new User("john", "john@smt.com", 33));
        userList.add(new User("someone", "puudub", 5));
        userList.add(new User("I have no idea what to write here", "" ,11));
        userList.add(new User("keegi veel", "email@email.com", 32));
        return userList;
    }

    @GetMapping("exception_test2")
    public Result exceptionTest2(
            @RequestParam("i") Integer i,
            @RequestParam("j") String j){
        return new Result(accountService.test2(i.toString(), j));
    }

    @GetMapping("excption_test")
    public int exceptionTest(
            @RequestParam(value = "i", required = false) Integer i){
        return fib(i);
    }
    private int fib(Integer i) {
        if(i == null){
            throw new ApplicationException("i peab olema määratud");
        }
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

    private void test(int i){
        if(i % 100 == 0){
            System.out.println(i);
        }
        test(i+1);
    }
}
