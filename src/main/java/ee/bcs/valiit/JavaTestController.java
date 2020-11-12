package ee.bcs.valiit;

import ee.bcs.valiit.tasks.Lesson1MathUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaTestController {

    @GetMapping("hello")
    public String helloWorld(){
        return "hello world";
    }

    @GetMapping("web-test/min/{pathVariableA}/{pathVariableB}")
    public int min(
            @PathVariable("pathVariableA") int a,
            @PathVariable("pathVariableB") int b){
        return Lesson1MathUtil.min(a, b);
    }

    public void test2(){

    }
}
