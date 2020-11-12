package ee.bcs.valiit.service;

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
}
