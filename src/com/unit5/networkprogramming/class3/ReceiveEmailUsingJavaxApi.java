package com.unit5.networkprogramming.class3;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;

public class ReceiveEmailUsingJavaxApi {

	public static void main(String[] args) throws MessagingException, IOException {

		String host = "pop3host";
		String username = "username";
		String password = "password";

		// step 1 : Create Session
		Properties props = new Properties();
		props.put("mail.pop3.host", host);
		props.put("mail.pop3.port", "110");

		Session session = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("username", "password");
			}
		});

		// Step 2:
		Store store = session.getStore("pop3");
		store.connect(host, username, password);

		//Step 3:
		Folder inbox = store.getFolder("INBOX");
		inbox.open(Folder.READ_ONLY);


		//Step 4:
		Message[] messages = inbox.getMessages();
		for (Message message : messages) {
			System.out.println("Subject: " + message.getSubject());
			System.out.println("From: " + message.getFrom()[0]);
			System.out.println("Content: " + message.getContent());
		}

		//Step 5:
		inbox.close(false);
		store.close();
	}

}
