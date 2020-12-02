package ee.bcs.valiit.respository2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

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
        return null;
    }

    public void addCar() throws MessagingException {
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("user", "password");
                    }
                });
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("from@gmail.com"));
        message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse("to@gmail.com")
        );
        message.setSubject("Test email");
        message.setText("Vali IT test");

        Transport.send(message);

        String sql = "insert into car (reg_num) values (:regNum)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("regNum", "test");
        jdbcTemplate.update(sql, paramMap);
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
