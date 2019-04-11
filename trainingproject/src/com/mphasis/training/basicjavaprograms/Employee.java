package com.mphasis.training.basicjavaprograms;

public class Employee extends Person {
	
	private int empno;
	private String project;
	public Employee(String pname, String address,
			long ph_no, long adar_num,int empno,String project) {
		super(pname, address, ph_no, adar_num);
		this.empno=empno;
		this.project=project;	
	}
	
	public void getDetails() {
		super.getDetails();
		System.out.println("Employee details");
		System.out.println(empno+" "+project);	
	}

}
