package com.mphasis.training.basicjavaprograms;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		
		System.out.println(s1);
		System.out.println(s1.concat(" training"));
		System.out.println(s1);
		//definsive programming
		if(s1.length()>5) {
		System.out.println(s1.charAt(5));
		}else {
			System.out.println("string length is too short");
		}
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(b>0)
		System.out.println("division of number"+(a/b));
		else
			System.out.println("number caanot deivide by zero");
		int arr[]= {10,34,56,12,45};
		if(arr.length >9)
		System.out.println(arr[10]);
		
		
		
		
		StringBuffer stb=new StringBuffer("Mphasis");
		System.out.println(stb);
		System.out.println(stb.append(" training"));
		System.out.println(stb.reverse());
		System.out.println(stb);
		
		System.out.println();
		StringBuilder stb1=new StringBuilder("Mphasis");
		System.out.println(stb1);
		System.out.println(stb1.append(" training"));
		System.out.println(stb1.reverse());
		System.out.println(stb1);
		

	}

}
