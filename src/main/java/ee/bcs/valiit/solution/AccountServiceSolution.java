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

    public String createAccount(String accountNumber) {
        String sql = "INSERT INTO account (account_number) VALUES (:accountNumber)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("accountNumber", accountNumber);
        jdbcTemplate.update(sql, paramMap);
        return "Konto " + accountNumber + " on loodud";
    }
}
