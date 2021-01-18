package ee.bcs.valiit.tasks.solution.controller;

import ee.bcs.valiit.tasks.solution.SolutionLesson1MathUtil;
import org.springframework.web.bind.annotation.*;

@RequestMapping("solution")
@RestController
public class SolutionMathUtilController {

    // http://localhost:8080/solution/min?a=5&b=9
    @GetMapping("min")
    public int min(@RequestParam("a") int aVariable, @RequestParam("b") int bVariable){
        return SolutionLesson1MathUtil.min(aVariable, bVariable);
    }

    // http://localhost:8080/solution/max/5/9
    @GetMapping("max/{a}/{b}")
    public int max(@PathVariable("a") int aVariable, @PathVariable("b") int bVariable){
        return SolutionLesson1MathUtil.max(aVariable, bVariable);
    }
}
