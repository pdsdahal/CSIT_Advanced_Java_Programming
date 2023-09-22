package com.unit1.programminginjava.class5.threadsynchronizedstatic;

public class Thread1 extends Thread {
	
	private ClassBook classBook;
	private int seats;
	
	public Thread1(ClassBook classBook,int seats) {
		this.classBook = classBook;
		this.seats = seats;
	}
	
	public void run() {
		classBook.bookSeat(seats);
	}
}
