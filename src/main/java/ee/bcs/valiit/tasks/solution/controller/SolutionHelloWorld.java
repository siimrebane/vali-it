package ee.bcs.valiit.tasks.solution.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SolutionHelloWorld {

    @GetMapping("solution/hello")
    public String helloWorld(){
        return "Hello World";
    }
}
