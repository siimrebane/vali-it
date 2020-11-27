package ee.bcs.valiit.service;

import ee.bcs.valiit.controller.AccountResponse;
import ee.bcs.valiit.respository2.AccountEntity;
import ee.bcs.valiit.respository2.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Scheduled(cron = "")
    public Integer createAccount(String requestName, String requestAddress){
        String sql = "INSERT INTO customer (name, address) " +
                "VALUES (:muutuja1, :muutuja2)";
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("muutuja1", requestName);
        paramMap.put("muutuja2", requestAddress);

        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(sql, new MapSqlParameterSource(paramMap), keyHolder);
        return (Integer) keyHolder.getKeys().get("id");
    }

    public void testTest() {
        accountRepository.getCar(1);
    }

    public AccountResponse getAccount(Long id) {
        AccountEntity account = accountRepository.getAccount(id);
        return new AccountResponse(account);
    }
}
