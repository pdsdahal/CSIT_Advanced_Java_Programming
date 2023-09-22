package com.unit1.programminginjava.class5.threadsynchronizationissues;

public class ClassBookMain extends Thread {
	
	int seats;
	static ClassBook obj;
	
	public void run() {
		obj.bookSeat(seats);
	}
	
	public static void main(String[] args) {
		
		obj = new ClassBook();
		ClassBookMain thread1 = new ClassBookMain();
		thread1.seats = 20;
		thread1.start();
		
		ClassBookMain thread2 = new ClassBookMain();
		thread2.seats = 30;
		thread2.start();
	}

}
