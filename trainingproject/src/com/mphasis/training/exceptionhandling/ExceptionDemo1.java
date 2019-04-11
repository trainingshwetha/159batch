package com.mphasis.training.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.next();
		System.out.println(s1);
		System.out.println(s1.concat(" training"));
		System.out.println(s1);
	try {
		System.out.println(s1.charAt(5));
		System.out.println("enter two integers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("division of number"+(a/b));
		int arr[]= {10,34,56,12,45};
		System.out.println(arr[10]);
	}catch(Exception e) {
		e.printStackTrace();
	}
		System.out.println("bye bye");


	}

}
