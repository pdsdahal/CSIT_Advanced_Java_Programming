package com.unit1.programminginjava.class5.interthreadcommunication;

public class FindSum extends Thread {
	
	int sum = 0;
	public void run() {
		
		synchronized (this) {
			
			for(int i=0;i<100;i++) {
				sum = sum+i;
			}
			notify();	
		}
	
		
	}
	
	public int getSum() {
		return sum;
	}

}
