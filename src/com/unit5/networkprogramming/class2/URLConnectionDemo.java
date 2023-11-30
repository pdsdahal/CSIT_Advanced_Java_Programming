package com.unit5.networkprogramming.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://google.com");
			URLConnection urlConnection = url.openConnection();
			urlConnection.setAllowUserInteraction(true);
			String contentType =  urlConnection.getContentType();
			System.out.println("Content Type : "+contentType);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			String response = null;
			while((response = br.readLine())!=null) {
				System.out.println(response);
			}
			
		} catch (Exception e) {

		}
	}

}
