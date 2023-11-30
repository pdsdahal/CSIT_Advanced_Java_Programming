package com.unit5.networkprogramming.class2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ServerUdp {

	public static void main(String[] args) {

		int port = 3421;
		try {
			//step 1 : create datagram socket
			DatagramSocket serverSocket = new DatagramSocket(port);
			
			//Receive
			
			System.out.println("Server Started...");
			//step 2 : Read request from socket
			byte[] datas = new  byte[30000];
			DatagramPacket messageFromClinetDp = new DatagramPacket(datas, datas.length);
			serverSocket.receive(messageFromClinetDp);
			
			String message = new String(messageFromClinetDp.getData());
			System.out.println("Message from client : "+message);
			
			//step 3 : Write the reply message 
			
			//Send
			String serverResponse  = "Please send us your inquery.";
			byte[] sRs = serverResponse.getBytes();
			InetAddress inetAddress = InetAddress.getLocalHost();
			DatagramPacket dpResponse = new DatagramPacket(sRs, sRs.length,inetAddress,messageFromClinetDp.getPort());
			serverSocket.send(dpResponse);
			
			
			
		} catch (Exception e) {
		}

	}

}
