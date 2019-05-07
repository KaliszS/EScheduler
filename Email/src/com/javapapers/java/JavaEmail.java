package com.javapapers.java;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class JavaEmail {

    Properties emailProperties;
    Session mailSession;
    MimeMessage emailMessage;

    public static void main(String args[]) throws javax.mail.MessagingException {

        JavaEmail javaEmail = new JavaEmail();

        javaEmail.setMailServerProperties();
        javaEmail.createEmailMessage();
        javaEmail.sendEmail();
    }

    public void setMailServerProperties() {

        String emailPort = "587";//gmail's smtp port

        emailProperties = System.getProperties();
        emailProperties.put("mail.smtp.port", emailPort);
        emailProperties.put("mail.smtp.auth", "true");
        emailProperties.put("mail.smtp.starttls.enable", "true");

    }

    public void createEmailMessage() throws javax.mail.MessagingException {
        String[] toEmails = { "skaliszoo@gmail.com" };
        String emailSubject = "STRZAŁ Z BATA";
        String emailBody = "DO ROBOTYYYY";

        mailSession = Session.getDefaultInstance(emailProperties, null);
        emailMessage = new MimeMessage(mailSession);

        for (int i = 0; i < toEmails.length; i++) {
            emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmails[i]));
        }

        emailMessage.setSubject(emailSubject);
        emailMessage.setContent(emailBody, "text/html");//for a html email
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