package ee.bcs.valiit.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NewTestController {

    @CrossOrigin
    @GetMapping("newTest")
    public List<NewTest> getNewTestList(){
        List<NewTest> newTestList = new ArrayList<>();
        newTestList.add(new NewTest("a", "b"));
        newTestList.add(new NewTest("c", "d"));
        return newTestList;
    }

    @CrossOrigin
    @PostMapping("newTest")
    public void saveStuff(@RequestBody List<NewTest> resultList){
        for (NewTest item : resultList) {
            System.out.println(item);
        }
    }
}
