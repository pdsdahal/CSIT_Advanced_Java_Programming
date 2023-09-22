package com.unit1.programminginjava.class5.interthreadcommunication;

public class FindSumMain {

	public static void main(String[] args) throws Exception {
		
		FindSum thread1 = new FindSum();
		
		thread1.start();
		
		synchronized (thread1) {
			thread1.wait();
		}
		
		
		int result  = thread1.getSum();
		System.out.println("Result : "+result);
	}
}
