package ee.bcs.valiit.respository2;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public class AccountRepository {
    public String test2(
            @RequestParam("i") int i,
            @RequestParam(value = "j", required = true) int j){
        String test = "test";
        return test.substring(i, j);
    }
}
