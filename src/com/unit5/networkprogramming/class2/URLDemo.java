package com.unit5.networkprogramming.class2;

import java.net.URL;

public class URLDemo {

	public static void main(String[] args) {

		try {
			URL url = new URL("www.google.com");
			System.out.println("Port Number : "+url.getPort());
			System.out.println("Host : "+url.getHost());
			System.out.println("Query Parameter : "+url.getQuery());
		} catch (Exception e) {

		}

	}

}
