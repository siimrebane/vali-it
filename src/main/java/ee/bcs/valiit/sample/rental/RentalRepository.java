package ee.bcs.valiit.sample.rental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class RentalRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public List<RentalEntity> getRentals(){
        String sql = "SELECT number, client_first_name, client_last_name, \"from\", \"to\"\n" +
                "FROM rental r JOIN car c on c.id = r.car_id";
        return jdbcTemplate.query(sql, new HashMap<>(), new RentalEntityMapper());
    }

    public Integer saveCar(String number, String brand) {
        String sql = "INSERT INTO car (number, brand) VALUES (:number, :brand)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("number", number);
        paramMap.put("brand", brand);
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(sql, new MapSqlParameterSource(paramMap), keyHolder);
        return (Integer) keyHolder.getKeys().get("id");
    }

    public void saveRental(Integer carId,
                           String firstName,
                           String lastName,
                           LocalDate from,
                           LocalDate to) {
        String sql = "INSERT INTO rental " +
                "(car_id, client_first_name, client_last_name, \"from\", \"to\") " +
                "VALUES (:carId, :firstName, :lastName, :from, :to)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("carId", carId);
        paramMap.put("firstName", firstName);
        paramMap.put("lastName", lastName);
        paramMap.put("from", from);
        paramMap.put("to", to);
        jdbcTemplate.update(sql, paramMap);
    }

    private class RentalRowMapper implements RowMapper<RentalDto> {

        @Override
        public RentalDto mapRow(ResultSet resultSet, int i) throws SQLException {
            RentalDto rental = new RentalDto();
            rental.setCarNumber(resultSet.getString("number"));
            rental.setFrom(resultSet.getObject("from", LocalDate.class));
            rental.setTo(resultSet.getObject("to", LocalDate.class));
            String firstName = resultSet.getString("client_first_name");
            String lastName = resultSet.getString("client_last_name");
            rental.setFullName(firstName + " " + lastName);
            return rental;
        }
    }

    private class RentalEntityMapper implements RowMapper<RentalEntity> {
        @Override
        public RentalEntity mapRow(ResultSet resultSet, int i) throws SQLException {
            RentalEntity rental = new RentalEntity();
            rental.setNumber(resultSet.getString("number"));
            rental.setFrom(resultSet.getObject("from", LocalDate.class));
            rental.setTo(resultSet.getObject("to", LocalDate.class));
            rental.setClientFirstName(resultSet.getString("client_first_name"));
            rental.setClientLastName(resultSet.getString("client_last_name"));
            return rental;
        }
    }
}
