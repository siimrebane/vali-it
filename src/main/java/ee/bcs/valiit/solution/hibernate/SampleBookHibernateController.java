package ee.bcs.valiit.solution.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SampleBookHibernateController {

    @Autowired
    private SampleBookHibernateService bookService;

    @GetMapping("sample/hibernate/book")
    public List<SampleBookResponse> test(@RequestParam("name") String name){
        return bookService.getAllBooks(name);
    }

}
