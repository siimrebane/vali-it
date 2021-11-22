package ee.bcs.valiit.solution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AccountServiceSolution {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    private AccountRepositorySolution accountRepository;

    public String createAccount(String accountNumber) {
        accountRepository.createAccount(accountNumber);
        return "Konto " + accountNumber + " on loodud";
    }

    public String getBalance(String accountNumber){
        String sql = "SELECT balance FROM account WHERE account_number = :accountNumber";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("accountNumber", accountNumber);
        int balance = jdbcTemplate.queryForObject(sql, paramMap, Integer.class);
        return "Konto " + accountNumber + " balanss on: " + balance;
    }

    public String depositMoney(String accountNumber, Integer amount) {
//        String sql = "SELECT balance FROM account WHERE account_number = :accountNumber";
//        Map<String, Object> paramMap = new HashMap<>();
//        paramMap.put("accountNumber", accountNumber);
//        int balance = jdbcTemplate.queryForObject(sql, paramMap, Integer.class);
        int balance = accountRepository.mingiF(accountNumber);
        int newBalance = balance + amount;
        accountRepository.mingiF2(accountNumber, newBalance);
        return "Konto " + accountNumber + " uus balanss on: " + newBalance;
    }
}
