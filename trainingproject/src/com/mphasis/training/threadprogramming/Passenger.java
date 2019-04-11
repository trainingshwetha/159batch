package com.mphasis.training.threadprogramming;

public class Passenger extends Thread{
	private int seatsNeeded;
	Passenger(int seats,Runnable target,String name){
		super(target,name);
		this.seatsNeeded=seats;
	}
	
	public int getSeatsNeeded() {
		return seatsNeeded;
	}

}
