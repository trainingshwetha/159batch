package com.mphasis.training.threadprogramming;

public class Bus implements Runnable{
	private int totalSeatsAvaialble=10;
	
	public int getTotalSeatsAvaialble() {
		return totalSeatsAvaialble;
	}
	
	public boolean bookTicket(int seats,String name) {
		System.out.println("welcome to Mphasis Bus"
				+Thread.currentThread().getName()+
				"Number of avaiable Tickets"
				+this.getTotalSeatsAvaialble());
		if(seats>this.getTotalSeatsAvaialble()) {
			return false;
		}else {
			totalSeatsAvaialble=totalSeatsAvaialble-seats;
			return true;
		}
		
	}
	
	@Override
	public void run() {
		Passenger pt=(Passenger)Thread.currentThread();
		boolean ticketsBooked=
			this.bookTicket(pt.getSeatsNeeded(), pt.getName());
	   if(ticketsBooked==true) {
	System.out.println("Congrats Mr."+Thread.currentThread().getName());
	System.out.println("The number of tickets booked"+
		   pt.getSeatsNeeded());
	   }else {
 System.out.println("Sorry Mr."+Thread.currentThread().getName());
System.out.println("The number of tickets are not booked"+
				   pt.getSeatsNeeded());
	   }
	}
}
