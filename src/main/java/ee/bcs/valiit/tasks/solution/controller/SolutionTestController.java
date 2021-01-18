package ee.bcs.valiit.tasks.solution.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("solution")
@RestController
public class SolutionTestController {

    // localhost:8080/solution/test/siim
    @GetMapping("test/{name}")
    public String getHelloWorld(@PathVariable("name") String userName, @RequestParam("name") String lastName){
        return "Hello " + userName + " " + lastName;
    }

    @GetMapping("test2")
    public int testArray(@RequestParam("array") int[] array){
        return array.length;
    }

    @GetMapping("test3")
    public String testString(@RequestParam(value = "test", defaultValue = "uusTest") String test){
        return test;
    }

    // see ei tööta
//    @GetMapping("fib/{a}")
//    public int ex4(@RequestParam("a") int a){
//        return 0;
//    }

    @GetMapping("fib/{a}")
    public int ex4Path(@PathVariable("a") int a){
        return a;
    }

    @GetMapping("fib")
    public int ex4Query(@RequestParam("a") int a){
        return a;
    }
}
