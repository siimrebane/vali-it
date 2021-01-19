package ee.bcs.valiit.tasks.solution.controller;

import ee.bcs.valiit.tasks.solution.SolutionLesson1;
import ee.bcs.valiit.tasks.solution.SolutionLesson1MathUtil;
import org.springframework.web.bind.annotation.*;

/*
//          DON'T CHANGE THIS FILE
*/

@RequestMapping("solution/mathutil")
@RestController
public class SolutionMathUtilController {

    // http://localhost:8080/solution/mathutil/min?a=5&b=9
    @GetMapping("min")
    public int min(@RequestParam("a") int aVariable, @RequestParam("b") int bVariable){
        return SolutionLesson1MathUtil.min(aVariable, bVariable);
    }

    // http://localhost:8080/solution/mathutil/max/5/9
    @GetMapping("max/{a}/{b}")
    public int max(@PathVariable("a") int aVariable, @PathVariable("b") int bVariable){
        return SolutionLesson1MathUtil.max(aVariable, bVariable);
    }

    // http://localhost:8080/solution/mathutil/abs?x=-99
    @GetMapping("abs")
    public int abs(int x){
        return SolutionLesson1MathUtil.abs(x);
    }

    // http://localhost:8080/solution/mathutil/isEven/99
    @GetMapping("isEven/{x}")
    public boolean isEven(@PathVariable int x){
        return SolutionLesson1MathUtil.isEven(x);
    }

    // http://localhost:8080/solution/mathutil/min3?a=5&b=9&c=134
    @GetMapping("min3")
    public int min(@RequestParam("a") int aVariable,
                   @RequestParam("b") int bVariable,
                   @RequestParam("b") int cVariable){
        return SolutionLesson1MathUtil.min(aVariable, bVariable, cVariable);
    }

    // http://localhost:8080/solution/mathutil/max/5/9/987
    @GetMapping("max/{a}/{b}/{c}")
    public int max(@PathVariable("a") int aVariable,
                   @PathVariable("b") int bVariable,
                   @PathVariable("c") int cVariable){
        return SolutionLesson1MathUtil.max(aVariable, bVariable, cVariable);
    }
}
