package com.unit1.programminginjava.class5.threadsynchronizedstatic;

public class MainStaticSynchronizationDemo {

	public static void main(String[] args) {

		ClassBook classBook = new ClassBook();

		Thread1 thread1 = new Thread1(classBook, 10);
		thread1.start();

		Thread2 thread2 = new Thread2(classBook, 25);
		thread2.start();

		ClassBook classBook1 = new ClassBook();

		Thread1 thread3 = new Thread1(classBook1, 10);
		thread3.start();

		Thread2 thread4 = new Thread2(classBook1, 25);
		thread4.start();

	}
}
