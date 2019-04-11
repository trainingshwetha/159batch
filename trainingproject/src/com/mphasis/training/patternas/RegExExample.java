package com.mphasis.training.patternas;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
	System.out.println(Pattern.matches("\\w+",s));
	System.out.println(Pattern.matches("[a-z]{6}", "abacde"));
	System.out.println(Pattern.matches("[A-Z]{6}", "abacde"));
	System.out.print(Pattern.matches("[0-9]{10}", "1234567891"));

	}

}
