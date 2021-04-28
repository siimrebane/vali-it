package ee.bcs.valiit.solution.repository;

import ee.bcs.valiit.solution.controller.SampleAccount2;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SampleAccount2RowMapper implements RowMapper<SampleAccount2> {

    @Override
    public SampleAccount2 mapRow(ResultSet resultSet, int i) throws SQLException {
        SampleAccount2 result = new SampleAccount2();
        result.setBalance(resultSet.getDouble("balance"));
        result.setAccountNumber(resultSet.getString("account_number"));
        return result;
    }
}
