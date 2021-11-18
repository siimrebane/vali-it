package ee.bcs.valiit.solution;

import ee.bcs.valiit.controller.SolutionDepositMoneyRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AccountControllerSolution {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @PostMapping("solution/account/{account}")
    public String createAccount(@PathVariable("account") String accountNumber){
        String sql = "INSERT INTO account (account_number) VALUES (:accountNumber)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("accountNumber", accountNumber);
        jdbcTemplate.update(sql, paramMap);
        return "Konto " + accountNumber + " on loodud";
    }

    @GetMapping("solution/account/{account}")
    public String getBalance(@PathVariable("account") String accountNumber) {
        String sql = "SELECT balance FROM account WHERE account_number = :accountNumber";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("accountNumber", accountNumber);
        int balance = jdbcTemplate.queryForObject(sql, paramMap, Integer.class);
        return "Konto " + accountNumber + " balanss on: " + balance;
    }

    @PutMapping("solution/account/{account}/deposit/{amount}")
    public String depositMoney(@PathVariable("account") String accountNumber,
                               @PathVariable("amount") Integer amount) {
        String sql = "SELECT balance FROM account WHERE account_number = :accountNumber";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("accountNumber", accountNumber);
        int balance = jdbcTemplate.queryForObject(sql, paramMap, Integer.class);
        int newBalance = balance + amount;
        String sql2 = "UPDATE account SET balance = :newBalance WHERE account_number = :accountNumber";
        Map<String, Object> paramMap2 = new HashMap<>();
        paramMap2.put("accountNumber", accountNumber);
        paramMap2.put("newBalance", newBalance);
        jdbcTemplate.update(sql2, paramMap2);
        return "Konto " + accountNumber + " uus balanss on: " + newBalance;
    }

    @PutMapping("solution/account/deposit")
    public String depositMoney(@RequestBody SolutionDepositMoneyRequest request) {
        String sql = "SELECT balance FROM account WHERE account_number = :accountNumber";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("accountNumber", request.getAccountNumber());
        int balance = jdbcTemplate.queryForObject(sql, paramMap, Integer.class);
        int newBalance = balance + request.getAmount();
        String sql2 = "UPDATE account SET balance = :newBalance WHERE account_number = :accountNumber";
        Map<String, Object> paramMap2 = new HashMap<>();
        paramMap2.put("accountNumber", request.getAccountNumber());
        paramMap2.put("newBalance", newBalance);
        jdbcTemplate.update(sql2, paramMap2);
        return "Konto " + request.getAccountNumber() + " uus balanss on: " + newBalance;
    }
}
