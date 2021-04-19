package ee.bcs.valiit.solution.controller;

import ee.bcs.valiit.solution.service.SampleBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SampleBankController {
    private static Map<String, SampleAccount> accountBalanceMap = new HashMap<>();

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    private SampleBankService sampleBankService;

    // http://localhost:8080/sample/bank/createAccount?accountNr=EE128&balance=2500
    @GetMapping("sample/bank/createAccount")
    public void createAccount(@RequestParam("accountNr") String accountNr,
                              @RequestParam("balance") Double balance) {
        sampleBankService.createAccount(accountNr, balance);
    }

    // http://localhost:8080/sample/bank/account
    @PostMapping("sample/bank/account")
    public void createAccount2(@RequestBody SampleAccount request) {
        String sql = "INSERT INTO account(account_number, balance) VALUES(:dbAccNo, :dbAmount)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("dbAccNo", request.getAccountNumber());
        paramMap.put("dbAmount", request.getBalance());
        jdbcTemplate.update(sql, paramMap);
    }

    // http://localhost:8080/sample/bank/account/EE123
    @GetMapping("sample/bank/account/{accountNumber}")
    public String getBalance(@PathVariable("accountNumber") String accountNr){
        String sql = "SELECT balance FROM account WHERE account_number = :dbAccNo";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("dbAccNo", accountNr);
        Double balance = jdbcTemplate.queryForObject(sql, paramMap, Double.class);
        return "Konto balanss on: " + balance;
    }

    @PutMapping("sample/bank/account/{accountNumber}/lock")
    public String lock(@PathVariable("accountNumber") String accountNr){
        return null;
    }

    @PutMapping("sample/bank/account/{accountNumber}/unlock")
    public String unlock(@PathVariable("accountNumber") String accountNr){
        return null;
    }

    @GetMapping("sample/bank/account")
    public List<SampleAccount2> getAllAccounts(){
        String sql = "SELECT * FROM account";
        return jdbcTemplate.query(sql, new HashMap(), new SampleAccount2RowMapper());
    }
}
