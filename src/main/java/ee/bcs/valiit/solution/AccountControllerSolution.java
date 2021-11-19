package ee.bcs.valiit.solution;

import ee.bcs.valiit.controller.SolutionDepositMoneyRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AccountControllerSolution {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @PostMapping("solution/account/{account}")
    public String createAccount(@PathVariable("account") String accountNumber){
        String sql = "INSERT INTO account (account_number) VALUES (:accountNumber)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("accountNumber", accountNumber);
        namedParameterJdbcTemplate.update(sql, paramMap);
        return "Konto " + accountNumber + " on loodud";
    }

    @GetMapping("solution/account/{account}")
    public String getBalance(@PathVariable("account") String accountNumber) {
        String sql = "SELECT balance FROM account WHERE account_number = :accountNumber";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("accountNumber", accountNumber);
        int balance = namedParameterJdbcTemplate.queryForObject(sql, paramMap, Integer.class);
        return "Konto " + accountNumber + " balanss on: " + balance;
    }

    @PutMapping("solution/account/{account}/deposit/{amount}")
    public String depositMoney(@PathVariable("account") String accountNumber,
                               @PathVariable("amount") Integer amount) {
        String sql = "SELECT balance FROM account WHERE account_number = :accountNumber";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("accountNumber", accountNumber);
        int balance = namedParameterJdbcTemplate.queryForObject(sql, paramMap, Integer.class);
        int newBalance = balance + amount;
        String sql2 = "UPDATE account SET balance = :newBalance WHERE account_number = :accountNumber";
        Map<String, Object> paramMap2 = new HashMap<>();
        paramMap2.put("accountNumber", accountNumber);
        paramMap2.put("newBalance", newBalance);
        namedParameterJdbcTemplate.update(sql2, paramMap2);
        return "Konto " + accountNumber + " uus balanss on: " + newBalance;
    }

    @PutMapping("solution/account/deposit")
    public String depositMoney(@RequestBody SolutionDepositMoneyRequest request) {
        String sql = "SELECT balance FROM account WHERE account_number = :accountNumber";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("accountNumber", request.getAccountNumber());
        int balance = namedParameterJdbcTemplate.queryForObject(sql, paramMap, Integer.class);
        int newBalance = balance + request.getAmount();
        String sql2 = "UPDATE account SET balance = :newBalance WHERE account_number = :accountNumber";
        Map<String, Object> paramMap2 = new HashMap<>();
        paramMap2.put("accountNumber", request.getAccountNumber());
        paramMap2.put("newBalance", newBalance);
        namedParameterJdbcTemplate.update(sql2, paramMap2);
        return "Konto " + request.getAccountNumber() + " uus balanss on: " + newBalance;
    }

    @GetMapping("solution/account")
    public List<AccountDtoSolution> getAllAccounts(){
        String sql = "SELECT * FROM account";
        Map<String, Object> paraMap = new HashMap<>();
        List<AccountDtoSolution> result = namedParameterJdbcTemplate.query(sql, paraMap, new BeanPropertyRowMapper<>(AccountDtoSolution.class));
        return result;
    }

    @GetMapping("solution/account2")
    public List<AccountDtoSolution> getAllAccounts2(){
        String sql = "SELECT * FROM account";
        Map<String, Object> paraMap = new HashMap<>();
        List<AccountDtoSolution> result = namedParameterJdbcTemplate.query(sql, paraMap, new AccoutDtoRowMapper());
        return result;
    }

    private class AccoutDtoRowMapper implements RowMapper<AccountDtoSolution> {
        @Override
        public AccountDtoSolution mapRow(ResultSet resultSet, int i) throws SQLException {
            AccountDtoSolution result = new AccountDtoSolution();
            result.setAccountNumber(resultSet.getString("account_number"));
            result.setBalance(resultSet.getInt("balance"));
            result.setLocked(resultSet.getBoolean("locked"));
            return result;
        }
    }

    @GetMapping("solution/account2/{id}")
    public AccountDtoSolution getAccountInfo(@PathVariable("id") String accountNumber){
        String sql = "SELECT * FROM account WHERE account_number = :accountNumber";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("accountNumber", accountNumber);
        AccountDtoSolution accountDto = namedParameterJdbcTemplate.queryForObject(sql, paramMap, new AccoutDtoRowMapper());
        if (accountDto.isLocked()) {
            System.out.println("konto on lukus");
            return null;
        }
        System.out.println("konto jääk on: " + accountDto.getBalance());
        return accountDto;
    }

    // TODO 1 - teenuse, mis tagastab kogu info kõigi kontode kohta
}
