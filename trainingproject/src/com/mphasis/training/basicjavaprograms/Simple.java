package com.mphasis.training.basicjavaprograms;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.time.*;
public class Simple {
	public static void main(String... args) {
		Date today=new Date();
		Date dob2=new Date(1987, 11,03);
		Date dob3=new Date();
		dob3.setDate(03);
		dob3.setMonth(11);
		dob3.setYear(1987);
		System.out.println("print " +today);
		
		
		Calendar cal=new GregorianCalendar(1987, 11, 03);
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.ERA));
		System.out.println(cal.getFirstDayOfWeek());
		System.out.println(cal.getTime());
		
		//java 8
		LocalDate dob = LocalDate.of(1987, 11, 22);
		LocalDate today1=LocalDate.now();
		
		Period age=Period.between(dob, today1);
		System.out.println(age);
		
		
		
		
		
		
		
	}



}
