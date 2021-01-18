package ee.bcs.valiit.tasks.solution.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("solution")
@RestController
public class SolutionTestController {

    @GetMapping("test/{name}")
    public String getHelloWorld(@PathVariable("name") String userName, @RequestParam("name") String lastName){
        return "Hello " + userName + " " + lastName;
    }
}
