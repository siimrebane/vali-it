package ee.bcs.valiit.solution.controller;

import ee.bcs.valiit.sample.Book;
import ee.bcs.valiit.solution.SolutionLesson1;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SampleTestController {
    public List<Book> bookList = new ArrayList<>();

    // http://localhost:8080/sample/hello-world/John?action=Hey&action2=Midagi
    @GetMapping("sample/hello-world/{nameInUrl}")
    public String helloWorld(@PathVariable("nameInUrl") String name,
                             @RequestParam("action") String a,
                             @RequestParam("action2") String b){
        return a + " " + name + " " + b;
    }

    // http://localhost:8080/sample/min/1/5
    @GetMapping("sample/min/{aUrlis}/{bUrlis}")
    public int min(@PathVariable("aUrlis") int a, @PathVariable("bUrlis") int b){
        return SolutionLesson1.min(a, b);
    }

    // http://localhost:8080/sample/min?aUrlis=1&bUrlis=5
    @GetMapping("sample/min")
    public int min2(@RequestParam("aUrlis") int a, @RequestParam("bUrlis") int b){
        return SolutionLesson1.min(a, b);
    }

    // http://localhost:8080/sample/test-dto
    @GetMapping("sample/book")
    public List<Book> getAllBooks(){
        return bookList;
    }

    @PostMapping("sample/book")
    public void addBook(@RequestBody Book book){
        bookList.add(book);
    }

    // 1 = http://localhost:8080/
    // 2 = teks mis on getMappingu sees
    // 3 = ?
    // 4 = requestParamid kujul a=1&b=2&c=3
    // http://localhost:8080/sample/ex1/2/4?a=1
    @GetMapping("sample/ex1/{a}/{b}")
    public String test(@PathVariable("b") int z, @RequestParam("a") Integer a, @PathVariable("a") int y){
        return "Request param: " + a +
                "\nPath variable1: " + y +
                "\nPath variable1: " + z;
    }
}
