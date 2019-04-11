package com.mphasis.training.exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.next();
		System.out.println(s1);
		try {
		System.out.println(s1.charAt(5));//critical code
		}catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();//handling block
		}
		finally {
			System.out.println("exeuted");//mandatory block
		}
		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
		System.out.println("division of number"+(a/b));
		}catch(ArithmeticException | InputMismatchException  e) {
			e.printStackTrace();
		}
		int arr[]= {10,34,56,12,45};
		try {
		System.out.println(arr[10]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("bye bye");
	}

}
