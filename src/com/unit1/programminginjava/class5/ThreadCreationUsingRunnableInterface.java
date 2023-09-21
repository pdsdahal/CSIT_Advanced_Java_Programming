package com.unit1.programminginjava.class5;

public class ThreadCreationUsingRunnableInterface implements Runnable {

	public void run() {

		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName() + " , "+i + " , priority  "+Thread.currentThread().getPriority());
		}
	}
	
	public static void main(String[] args) {
		
		ThreadCreationUsingRunnableInterface obj1 = new ThreadCreationUsingRunnableInterface();
		ThreadCreationUsingRunnableInterface obj2 = new ThreadCreationUsingRunnableInterface();
		
		Thread thread1 = new Thread(obj1);
		Thread thread2 = new Thread(obj2);
		
		thread1.setName("First thread");
		thread2.setName("Second thread");
		
		thread1.setPriority(10);
		thread2.setPriority(9);
		
		thread1.start();
		thread2.start();
	}
}
