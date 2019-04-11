package com.mphasis.training.basicjavaprograms;

public class WagesEmployee extends Employee {
	public WagesEmployee(String pname, String address, long ph_no,
			long adar_num, int empno, String project,long wages) {
		super(pname, address, ph_no, adar_num, empno, project);
		this.wages=wages;
		// TODO Auto-generated constructor stub
	}

	private long wages;
	
	
	public void getDetails() {
		super.getDetails();
		System.out.println("Salary details");
		System.out.println("Monthly salary"+(wages*30));
	}

	

}
