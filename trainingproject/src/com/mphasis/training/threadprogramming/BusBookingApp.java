package com.mphasis.training.threadprogramming;

public class BusBookingApp {

	public static void main(String[] args)throws InterruptedException {
		Bus b1=new Bus();
		Passenger p1=new Passenger(5, b1, "Vicky");
		Passenger p2=new Passenger(6, b1, "Micky");
		p1.start();
		p2.start();
		p1.join();
		p2.join();
		System.out.println("bye bye");
	}

}
