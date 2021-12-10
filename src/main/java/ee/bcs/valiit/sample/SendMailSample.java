package ee.bcs.valiit.sample;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendMailSample {
    private void send(String toEmail, String subject, String body) throws MessagingException {
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.starttls.enable", true);
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");

        Session session = Session.getInstance(prop,
                new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("user", "password");
                    }
                }
        );

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("from@gmail.com")); // gmaili aadress kus te aadressi saadate (see uus emaili aadress)
        message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse(toEmail) // ükskõik mis emaili aadress. See kuhu email läheb
        );
        message.setSubject(subject);
        message.setText(body);
        Transport.send(message);
    }
}
