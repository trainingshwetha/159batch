package com.mphasis.training.pojos;

public class Student implements Comparable<Student>{
	private int st_id;
	private String sname;
	private double marks;

	public Student(int st_id, String sname, double marks) {
		super();
		this.st_id = st_id;
		this.sname = sname;
		this.marks = marks;
	}
	public int getSt_id() {
		return st_id;
	}
	public String getSname() {
		return sname;
	}
	public double getMarks() {
		return marks;
	}
	@Override
	public int compareTo(Student st1) {
		if(this.st_id>st1.st_id)
			return 1;
		else if(this.st_id<st1.st_id)
			return -1;
		else
			return 0;
	}
	
	
//	@Override
//	public String toString() {
//		return "Student [st_id=" + st_id + ", sname=" + sname + ", marks=" + marks + "]";
//	}
	

}
