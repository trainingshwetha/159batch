package com.mphasis.training.basicjavaprograms;

public class Address {
	private int doornum;
	private String street;
	private String area;
	private String city;
	private String state;
	private int pincode;
	public Address() {
		
	}
	public Address(int doornum, String street, String area, String city, String state, int pincode) {
		super();
		this.doornum = doornum;
		this.street = street;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "doornum=" + doornum + ", street=" + street + ", area=" + area + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + "";
	}
	

}
