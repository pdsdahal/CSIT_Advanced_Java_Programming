package com.unit5.networkprogramming.class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TcpClient {
	
	public static void main(String[] args) {
		
		int port = 7845;

		try {

			//Step - I Server Setup 
			Socket clientSocket = new Socket("localhost", port);
			
			//step- II : input and output streams
			BufferedReader severIn = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			BufferedWriter serverOut = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
			BufferedReader clientIn = new BufferedReader(new InputStreamReader(System.in));
			//step - III : Processing 
			
			String clientMessage;
			String serverMessage;
			
			while(true) {
				
				System.out.println("Enter a message to server : ");
				clientMessage =  clientIn.readLine();
				
				serverOut.write(clientMessage+"\n");
				serverOut.flush();
				
				serverMessage = severIn.readLine();
				System.out.println("Message  From Server : "+serverMessage);
				
			}
			
		} catch (Exception e) {

		}
	}

}
