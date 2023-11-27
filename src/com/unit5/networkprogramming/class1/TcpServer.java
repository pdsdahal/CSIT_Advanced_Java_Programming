package com.unit5.networkprogramming.class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) {

		int port = 7845;

		try {
			//Step - I Server Setup
			ServerSocket serverSocket = new ServerSocket(port);
			
			System.out.println("Sever Connection Established");
			//Step- II Accepting client connection
			Socket clientSocket = serverSocket.accept();
			
			//step- III : input and output streams
			BufferedReader clientIn = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			BufferedWriter clientOut = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
			BufferedReader serverIn = new BufferedReader(new InputStreamReader(System.in));
			//step - IV : Processing 
			
			String clientMessage;
			String serverMessage;
			
			while(true) {
				
				clientMessage = clientIn.readLine();
				System.out.println("Message from Client : "+clientMessage);
				
				System.out.println("Reply message to Client");
				serverMessage = serverIn.readLine();
				
				clientOut.write(serverMessage+"\n");
				clientOut.flush();
				
			}
			
		} catch (Exception e) {

		}
	}
}
