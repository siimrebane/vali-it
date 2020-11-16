package ee.bcs.valiit.service;

import ee.bcs.valiit.respository2.AccountRepository;
import ee.bcs.valiit.respository2.AccountRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public void createAccount(String requestName, String requestAddress){
        String sql = "INSERT INTO customer (name, address) " +
                "VALUES (:muutuja1, :muutuja2)";
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("muutuja1", requestName);
        paramMap.put("muutuja2", requestAddress);
        jdbcTemplate.update(sql, paramMap);
        jdbcTemplate.queryForObject(sql, paramMap, String.class);
    }

    public String test2(String i, String j) {
        Integer iValue = Integer.valueOf(i);
        Integer jValue = Integer.valueOf(j);
        return accountRepository.test2(iValue, jValue);
    }
}
