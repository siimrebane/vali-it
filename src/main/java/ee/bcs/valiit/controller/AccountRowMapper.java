package ee.bcs.valiit.controller;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountRowMapper implements RowMapper<Account> {

    @Override
    public Account mapRow(ResultSet resultSet, int i) throws SQLException {
        Account account = new Account();
        account.setAccountNr(resultSet.getString("account_nr"));
        account.setBalance(resultSet.getBigDecimal("balance"));
        account.setId(resultSet.getLong("id"));
        return account;
    }
}
