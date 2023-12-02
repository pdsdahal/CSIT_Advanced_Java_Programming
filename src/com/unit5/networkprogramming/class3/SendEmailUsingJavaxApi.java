package com.unit5.networkprogramming.class3;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

public class SendEmailUsingJavaxApi {
	
	public static void main(String[] args) throws MessagingException {
		
		//step 1  : Create Session
		Properties props = new Properties();
		props.put("mail.smtp.host","smtp.gmail.com");
		props.put("mail.smtp.port","465");
		
		 // Create a session with the provided properties
        Session session = Session.getInstance(props, new Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication("username", "password");
            }
        });
		
		//Step 2: Compose Message

		MimeMessage message = new MimeMessage(session);
		message.setFrom("abc@gmail.com");
		message.addRecipient(RecipientType.TO, new InternetAddress("xyz@gmail.com"));
		message.setText("Dear All,\n Please submit your assignments on coming sunday.");
		message.setSubject("Request to submit assignments and labsheets");
		
		
		//set 3 : Send Message
		Transport.send(message);
	}

}
