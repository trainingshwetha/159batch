package com.mphasis.training.basicjavaprograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Student{
	private int st_id;
	private String st_name;
	private Date doj;
	public int getSt_id() {
		return st_id;
	}
	public void setSt_id(int st_id) {
		this.st_id = st_id;
	}
	public String getSt_name() {
		return st_name;
	}
	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
}

public class StudentDetails {
	public static void main(String[] args) throws ParseException {
		Student st=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		st.setSt_id(sc.nextInt());
		System.out.println("enter name");
		st.setSt_name(sc.next());
		System.out.println("enter the date dd.MM.yyyy");
		String s1=sc.next();
		Date doj1=new SimpleDateFormat("dd.MM.yyyy").parse(s1);
		System.out.println(doj1.getDate()+ " "+(doj1.getMonth()+1));
		System.out.println((doj1.getYear()+1900));
//		int year=sc.nextInt();
//		int month=sc.nextInt();
//		int day=sc.nextInt();
//		Date d1=new Date(year, month, day);
//		st.setDoj(d1);
//		Date d12=st.getDoj();
//		System.out.println(st.getSt_id()+ " "+st.getSt_name()+ " "+d12.getDate());
	}

}
