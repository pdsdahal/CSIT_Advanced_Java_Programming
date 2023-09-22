package com.unit1.programminginjava.class5.threadsynchronizedstatic;

public class ClassBook {

	static int total = 45;

	static synchronized void bookSeat(int seats) {

		if (total >= seats) {
			System.out.println("Booked Successfully! "+seats);
			total = total -seats;
			System.out.println("Seat Left : "+total);
		}else {
			System.out.println("Failed to booked."+seats);
			System.out.println("Seat Left : "+total);
		}
	}

}
