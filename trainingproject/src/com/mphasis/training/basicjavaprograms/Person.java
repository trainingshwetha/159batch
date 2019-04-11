package com.mphasis.training.basicjavaprograms;

public class Person {
	private String pname;
	private String address;
	private long ph_no;
	private long adar_num;
	public Person(String pname, String address, long ph_no, long adar_num) {
		super();
		this.pname = pname;
		this.address = address;
		this.ph_no = ph_no;
		this.adar_num = adar_num;
	}
	
	public void getDetails() {
		System.out.println("person details");
		System.out.println(pname+" "+address+" "+ph_no+" "+adar_num);
	}
	
	

}
