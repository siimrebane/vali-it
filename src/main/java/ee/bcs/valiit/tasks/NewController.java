package ee.bcs.valiit.tasks;

import org.springframework.web.bind.annotation.*;

@RequestMapping("test")
@RestController
public class NewController {
    @GetMapping("a/*/a/{a}/{b}/c")
    public void test(@PathVariable("a") String a,
                     @RequestParam("a") String aa,
                     @RequestParam("b") Integer bb,
                     @PathVariable("b") Integer b){
        System.out.println("test");
    }

}
