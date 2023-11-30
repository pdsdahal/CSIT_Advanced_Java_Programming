package com.unit5.networkprogramming.class2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUdp {

	public static void main(String[] args) {

		int port = 3421;
		try {
			//step 1 : Create socket
			DatagramSocket clientSocket = new DatagramSocket();
			
			//send 
			
			//step 2 : Send request from socket
			String inputMessage = "This is texas college.";
			byte[] iM = inputMessage.getBytes();
			
			InetAddress inetAddress = InetAddress.getByName("localhost");
			DatagramPacket dp = new DatagramPacket(iM, iM.length, inetAddress, port);
			clientSocket.send(dp);
			
			//receive
			
			//step 3:Read Reply message
			byte[] datas = new  byte[30000];
			DatagramPacket messageFromServerDp = new DatagramPacket(datas, datas.length);
			clientSocket.receive(messageFromServerDp);
			String message = new String(messageFromServerDp.getData());
			System.out.println("Message from Server : "+message);
			
		} catch (Exception e) {

		}
	}

}
