package com.mphasis.training.assignment;

public class Employee {
	private int empid;
	private String ename;
	private int age;
	private double salary;
	public Employee(int empid, String ename, int age, double salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "empid=" + empid + ", ename=" + ename + ", age=" + age + ", salary=" + salary ;
	}
	

}
