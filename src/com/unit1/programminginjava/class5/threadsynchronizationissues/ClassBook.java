package com.unit1.programminginjava.class5.threadsynchronizationissues;

public class ClassBook {

	int total = 45;

	public void bookSeat(int seats) {

		if (total >= seats) {
			System.out.println("Booked Successfully! "+seats);
			total = total -seats;
			System.out.println("Seat Left : "+total);
		}else {
			System.out.println("Failed to booked.");
			System.out.println("Seat Left : "+total);
		}
	}

}
