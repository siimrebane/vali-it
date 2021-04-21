package ee.bcs.valiit.solution.service;

import ee.bcs.valiit.solution.controller.SampleAccount2;
import ee.bcs.valiit.solution.controller.SampleAccount2RowMapper;
import ee.bcs.valiit.solution.exception.SampleApplicationException;
import ee.bcs.valiit.solution.repository.SampleAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SampleBankService {
    @Autowired
    private SampleAccountRepository accountRepository;

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public void createAccount(String accountNr, Double balance) {
        if(balance < 0){
            throw new SampleApplicationException("Summa ei tohi olla negatiivne");
        }
        accountRepository.createAccount(accountNr, balance);
    }

    public String getBalance(String accountNr){
        Double balance = accountRepository.getBalance(accountNr);
        return "Konto balanss on: " + balance;
    }

    public List<SampleAccount2> getAllAccounts() {
        String sql = "SELECT * FROM account";
        return jdbcTemplate.query(sql, new HashMap(), new SampleAccount2RowMapper());
    }
}
