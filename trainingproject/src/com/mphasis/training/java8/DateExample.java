package com.mphasis.training.java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String anotherDate = "04 Apr 2016";
		 
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMM yyyy");
		LocalDate random = LocalDate.parse(anotherDate, df);
		 
		System.out.println(anotherDate + " parses as " + random);
	}

}
