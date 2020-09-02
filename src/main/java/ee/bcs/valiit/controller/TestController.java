package ee.bcs.valiit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    private static final List<BankAccount> bankAccounts = new ArrayList();
    private static final Map<String, BankAccount> bankAccounts2 = new HashMap<>();

    @GetMapping("sqltest")
    public String testSql(){
        String sql = "SELECT account_nr FROM account where id = :id";
        Map<String, Object> paramMap = new HashMap();
        paramMap.put("id", 1);
        String vastus = jdbcTemplate.queryForObject(sql, paramMap, String.class);

        sql = "UPDATE account SET balane = :balance where id = :id";
        paramMap = new HashMap<>();
        paramMap.put("balance", 100);
        paramMap.put("id", 2);
        jdbcTemplate.update(sql, paramMap);

        return vastus;
    }


    @PostMapping("test/{id1}/{id2}/{id3}")
    public List<BankAccount> test(@PathVariable("id1") String pathId1,
                                  @RequestParam(value = "id2", required = false) Long queryId2,
                                  @PathVariable("id3") BigInteger pathId3,
                                  @PathVariable("id2") Long pathId2,
                                  @RequestBody BankAccount requestBody,
                                  @RequestParam(value = "id1", required = false) Integer queryId1,
                                  @RequestParam(value = "id3") BigInteger queryId3) {
        bankAccounts.add(requestBody);
        // {0, "test"}
        // {1, "test2"}
        // {2, "test4"}

        bankAccounts2.put(requestBody.getAccountNr(), requestBody);
        bankAccounts2.get(requestBody.getAccountNr());
        // {0, "test"}
        // {2, "test4"}

        return bankAccounts;
    }

    @PostMapping("test")
    public String test(@RequestBody Integer i) {
        return i.toString();
    }

    @PutMapping("test")
    public String test2(@RequestBody Integer i) {
        return i.toString();
    }


}
