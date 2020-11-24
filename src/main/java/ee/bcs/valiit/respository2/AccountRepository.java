package ee.bcs.valiit.respository2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Repository
public class AccountRepository {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public Car getCar(Integer id) {
        String sql = "SELECT * FROM car WHERE id = :id";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("id", id);
        return jdbcTemplate.queryForObject(sql, paramMap, new CarRowMapper());
    }

    public AccountEntity getAccount() {

    }

    private class CarRowMapper implements RowMapper<Car> {
        @Override
        public Car mapRow(ResultSet resultSet, int i) throws SQLException {
            return new Car();
        }
    }

    private class Car {
        private Integer id;
        private String name;
        private String regNum;

        public Integer getId() {
            return id;
        }

        public Car setId(Integer id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public Car setName(String name) {
            this.name = name;
            return this;
        }

        public String getRegNum() {
            return regNum;
        }

        public Car setRegNum(String regNum) {
            this.regNum = regNum;
            return this;
        }
    }
}
