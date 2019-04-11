package com.mphasis.training.basicjavaprograms;

public class PermanentEmployee extends Employee {

	private double salary;
	
	public PermanentEmployee(String pname, String address, 
			long ph_no, long adar_num, int empno, String project,
			double salary) {
		super(pname, address, ph_no, adar_num, empno, project);
		this.salary=salary;
	}
	
	public void getDetails() {
		super.getDetails();
		System.out.println("Salary details");
		System.out.println("Monthly salary"+(salary/12));
	}

}
