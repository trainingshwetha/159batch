package com.mphasis.training.view;

import java.util.Scanner;

import com.mphasis.training.basicjavaprograms.Employee;
import com.mphasis.training.basicjavaprograms.PermanentEmployee;
import com.mphasis.training.basicjavaprograms.Person;
import com.mphasis.training.basicjavaprograms.WagesEmployee;

public class EmployeeApp {
	public static void main(String[] args) {
		
		
		
		System.out.println("Welcome to Employee App");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter person details");
		String name=sc.next();
		String add=sc.next();
		long ph_num=sc.nextLong();
		long ad_num=sc.nextLong();
		
		System.out.println("Which Object you want to create\n"
				+ "1. Person\n"
				+ "2. Employee\n"
				+ "3.PermanentEmployee\n"
				+ "4. WagesEmployee\n"
				+ "5. Exit");
				int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Person p=new Person(name,add,
					ph_num,ad_num);
			p.getDetails();
			break;
		case 2: System.out.println("enter employee details");
		Employee employee=new Employee(name,add,
				ph_num,ad_num,sc.nextInt(), sc.next());
		employee.getDetails();
		break;
		case 3:System.out.println("enter empno,project,salary");
			PermanentEmployee pe=new PermanentEmployee(name,add,
					ph_num,ad_num, sc.nextInt(), sc.next(), sc.nextDouble());
			pe.getDetails();
			break;
		case 4: System.out.println("enter empno,project,wages");
		WagesEmployee we=new WagesEmployee(name, add, ph_num, ad_num,
				sc.nextInt(), sc.next(),sc.nextLong());
			we.getDetails();
			break;
		case 5: System.exit(0);	
		default : System.out.println("invalid choice");
		}
	}
}