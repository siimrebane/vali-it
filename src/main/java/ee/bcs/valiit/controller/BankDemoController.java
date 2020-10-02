package ee.bcs.valiit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BankDemoController {
    //private Map<String, Integer> accounts = new HashMap<>();
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @GetMapping("getAccountBalance")
    public Integer getAccountBalance(
            @RequestParam String accountNumber){
        String sql = "SELECT balance FROM account " +
                "WHERE account_nr = :aNr";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("aNr", accountNumber);
        Integer result = jdbcTemplate.queryForObject(
                sql, paramMap, Integer.class);

        // INSERT, UPDATE, DELETE lause (ei tagasta midagi)
        jdbcTemplate.update(sql, paramMap);
        // SELECT tagastab 1 tulba ja 1 rea
        jdbcTemplate.queryForObject(sql, paramMap, String.class);
        // Select tagastab 1 tulba aga mitu rida
        jdbcTemplate.queryForList(sql, paramMap, String.class);
        // Select tagastab mitu tulpa aga 1 rea
        jdbcTemplate.queryForObject(sql, paramMap, new AccountRowMapper());
        // Select tagastab mitu tulpa ja mitu rida
        jdbcTemplate.query(sql, paramMap, new AccountRowMapper());

        return result;
    }







}
