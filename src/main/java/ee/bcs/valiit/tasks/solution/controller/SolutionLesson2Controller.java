package ee.bcs.valiit.tasks.solution.controller;

import ee.bcs.valiit.tasks.solution.SolutionLesson2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("solution/lesson2")
@RestController
public class SolutionLesson2Controller {
    // http://localhost:8080/solution/lesson2/e1?array=1,2,3,4,5,6,7
    @GetMapping("e1")
    public int[] ex1(int[] array){
        return SolutionLesson2.exercise1Web(array);
    }
}
