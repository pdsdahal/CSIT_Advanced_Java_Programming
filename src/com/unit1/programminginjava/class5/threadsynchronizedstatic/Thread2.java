package com.unit1.programminginjava.class5.threadsynchronizedstatic;

public class Thread2 extends Thread {
	
	private ClassBook classBook;
	private int seats;
	
	public Thread2(ClassBook classBook,int seats) {
		this.classBook = classBook;
		this.seats = seats;
	}
	
	public void run() {
		classBook.bookSeat(seats);
	}
}
