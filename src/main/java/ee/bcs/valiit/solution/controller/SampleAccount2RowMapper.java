package ee.bcs.valiit.solution.controller;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SampleAccount2RowMapper implements RowMapper<SampleAccount2> {

    @Override
    public SampleAccount2 mapRow(ResultSet resultSet, int i) throws SQLException {
        SampleAccount2 response = new SampleAccount2();
        response.setAccountNumber(resultSet.getString("account_number"));
        response.setBalance(resultSet.getDouble("balance"));
        response.setId(resultSet.getInt("id"));
        response.setBlocked(resultSet.getBoolean("block"));
        return response;
    }
}
