package com.mphasis.training.basicjavaprograms;

import java.util.Scanner;

public class PasswordMatches {
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
		  String passwd = sc.next(); 
	      String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8}";
	      System.out.println(passwd.matches(pattern));
	   }

}
