package com.mphasis.training.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		try {
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			
			System.out.println(c1.div(n1, n2));
			
		}catch(ArithmeticException | InputMismatchException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("bye bye");
		}
		

	}

}
