package ee.bcs.valiit;

import ee.bcs.valiit.tasks.Lesson2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("test")
@RestController
public class TestController {

    @GetMapping("/fibonacci")
    public int test(@RequestParam("nr") int nr){
        return Lesson2.fibonacci(nr);
    }

    @GetMapping("ex2")
    public List<Integer> test2(@RequestParam("nr") int nr){
        List<Integer> resultList = new ArrayList<>();
        for(int i = 1; i <= nr; i++){
            System.out.println(i*2);
            resultList.add(i*2);
        }
        return resultList;
    }

    @GetMapping("table")
    public List multiplyinTable(@RequestParam("x") int x, int y){
        List<List<Integer>> result = new ArrayList<>();
        String stringResult = "";
        for(int i = 1; i <= x; i++){
            List<Integer> sisemineList = new ArrayList<>();
            for(int j = 1; j <= y; j++){
                sisemineList.add(i*j);
                if(i%2 == 0){
                    stringResult += "<b>";
                }
                stringResult += i*j + " ";
                if(i%2 == 0){
                    stringResult += "</b>";
                }
            }
            stringResult += "<br/>";
            result.add(sisemineList);
        }

        return result;
    }

    @GetMapping("abv")
    public Pair returStuff(){
        int a = 5;
        int b = 8;
        return new Pair(a, b);
    }

}
