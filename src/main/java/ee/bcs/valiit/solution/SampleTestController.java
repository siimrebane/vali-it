package ee.bcs.valiit.solution;

import ee.bcs.valiit.sample.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SampleTestController {

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
    @GetMapping("sample/test-dto")
    public List<Book> dtoGet(){
        Book book = new Book();
        book.setAuthor("siim");
        book.setTitle("minu raamat");
        book.setPublishedYear(2021);
        Book book2 = new Book();
        book2.setAuthor("keegi");
        book2.setTitle("muud");
        book2.setPublishedYear(2025);
        List<Book> list = new ArrayList<>();
        list.add(book);
        list.add(book2);
        return list;
    }

    @PostMapping("sample/test-dto")
    public List<Book> dtoPost(@RequestBody List<Book> books){
        System.out.println(books.get(0).getTitle());
        return books;
    }
}
