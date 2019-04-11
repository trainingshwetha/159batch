package com.mphasis.training.filehandling;

import java.io.Serializable;


public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8401651187356229021L;
	private int empid;
	private String ename;
	private String address;
	transient private double salay;
	public Employee(int empid, String ename, String address, double salay) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.address = address;
		this.salay = salay;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", address=" + address + ", salay=" + salay + "]";
	}
	
	
	
}
