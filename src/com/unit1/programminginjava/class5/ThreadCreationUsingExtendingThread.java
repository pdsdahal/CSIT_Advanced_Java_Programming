package com.unit1.programminginjava.class5;

public class ThreadCreationUsingExtendingThread extends Thread {

	public void run() {

		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName() + " , "+i + " , priority  "+Thread.currentThread().getPriority());
		}
	}
	
	public static void main(String[] args) {
		
		ThreadCreationUsingExtendingThread thread1 = new ThreadCreationUsingExtendingThread();
		ThreadCreationUsingExtendingThread thread2 = new ThreadCreationUsingExtendingThread();
		
		thread1.setName("First thread");
		thread2.setName("Second thread");
		
		
		thread1.setPriority(10);
		thread2.setPriority(9);
		
		thread1.start();
		thread2.start();
	}
}
