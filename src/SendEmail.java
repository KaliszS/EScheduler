
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendEmail {

    Properties emailProperties;
    Session mailSession;
    MimeMessage emailMessage;

    public void setMailServerProperties() {

        String emailPort = "587";//gmail's smtp port

        emailProperties = System.getProperties();
        emailProperties.put("mail.smtp.port", emailPort);
        emailProperties.put("mail.smtp.auth", "true");
        emailProperties.put("mail.smtp.starttls.enable", "true");

    }

    public void createEmailMessage(String msg, String mail) throws javax.mail.MessagingException {
        String toEmail = mail;
        String emailSubject = "Wydarzenie";

        mailSession = Session.getDefaultInstance(emailProperties, null);
        emailMessage = new MimeMessage(mailSession);

            emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));


        emailMessage.setSubject(emailSubject);
        emailMessage.setContent(msg, "text/html");//for a html email
        //emailMessage.setText(emailBody);// for a text email

    }

    public void sendEmail() throws javax.mail.MessagingException {

        String emailHost = "smtp.gmail.com";
        String fromUser = "eschedulerprojektpio@gmail.com";//just the id alone without @gmail.com
        String fromUserEmailPassword = "KusznikBezHonoru";

        Transport transport = mailSession.getTransport("smtp");

        transport.connect(emailHost, fromUser, fromUserEmailPassword);
        transport.sendMessage(emailMessage, emailMessage.getAllRecipients());
        transport.close();
        System.out.println("Email sent successfully.");
    }

}
