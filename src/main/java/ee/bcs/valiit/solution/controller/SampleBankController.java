package ee.bcs.valiit.solution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SampleBankController {
    private static Map<String, SampleAccount> accountBalanceMap = new HashMap<>();

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
/*
        if (line.equalsIgnoreCase("depositMoney")) {
            System.out.println("Please enter account nr");
            String accountNr = scanner.nextLine();
            System.out.println("Please enter amount");
            Double amount = scanner.nextDouble();
            scanner.nextLine();
            if (amount > 0) {
                Double currentBalance = accountBalanceMap.get(accountNr);
                Double newBalance = currentBalance + amount;
                accountBalanceMap.put(accountNr, newBalance);
            } else {
                System.out.println("Sisestatud summa peab olema positiivne number");
            }
        } else if (line.equalsIgnoreCase("withdrawMoney")) {
            System.out.println("Please enter account nr");
            String accountNr = scanner.nextLine();
            System.out.println("Please enter amount");
            Double amount = scanner.nextDouble();
            scanner.nextLine();
            if (amount > 0) {
                Double currentBalance = accountBalanceMap.get(accountNr);
                Double newBalance = currentBalance - amount;
                if (newBalance >= 0) {
                    accountBalanceMap.put(accountNr, newBalance);
                } else {
                    System.out.println("Kontol pole piisavalt raha");
                }
            } else {
                System.out.println("Sisestatud summa peab olema positiivne number");
            }
        } else if (line.equalsIgnoreCase("transferMoney")) {
            System.out.println("Please enter from account nr");
            String fromAccountNr = scanner.nextLine();
            System.out.println("Please enter to account nr");
            String toAccountNr = scanner.nextLine();
            System.out.println("Please enter amount");
            Double amount = scanner.nextDouble();
            scanner.nextLine();
            if (amount > 0) {
                double fromAccountBalance = accountBalanceMap.get(fromAccountNr);
                if (fromAccountBalance < amount) {
                    System.out.println("Kontol pole piisavalt raha");
                } else {
                    double toAccountBalance = accountBalanceMap.get(toAccountNr);
                    accountBalanceMap.put(fromAccountNr, fromAccountBalance - amount);
                    accountBalanceMap.put(toAccountNr, toAccountBalance + amount);
                }
            } else {
                System.out.println("Summa peab olema positiivne number");
            }
        }
        */
    }

    // http://localhost:8080/sample/bank/createAccount?accountNr=EE128&balance=2500
    @GetMapping("sample/bank/createAccount")
    public void createAccount(@RequestParam("accountNr") String accountNr,
                              @RequestParam("balance") Double balance) {
        String sql = "INSERT INTO account(account_number, balance) VALUES(:dbAccNo, :dbAmount)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("dbAccNo", accountNr);
        paramMap.put("dbAmount", balance);
        jdbcTemplate.update(sql, paramMap);
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
}
