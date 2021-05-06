package ee.bcs.valiit.solution.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Component
public class TestJob {


    @Scheduled(fixedDelay = 1000)
    public void test() {

    }

    public void sendMail() throws MessagingException {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        Session session = Session.getInstance(properties,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("user", "password");
                    }
                });
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("mina@gmail.com"));
        message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse("kellel@gmail.com"));
        message.setSubject("Pealkiri");
        message.setText("Kirja sisu");
        Transport.send(message);
    }
}
