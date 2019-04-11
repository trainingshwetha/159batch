package com.mphasis.training.collectiondemo;

import java.util.*;

import com.mphasis.training.comparators.MarskComparator;
import com.mphasis.training.comparators.NameComparator;
import com.mphasis.training.pojos.Student;

public class ListDemo {
static 	List<Student> students=new ArrayList<>();
	public static void display() {
		
	for(Student s:students) {
		System.out.println(s.getSt_id()+ " "+s.getSname()+" "+s.getMarks());
		}
	}
	
	
	public static void main(String[] args) {
	
		System.out.println("Sorting of students");
		Collections.sort(students);
		System.out.println("default Sorting");
		display();
		System.out.println("1. Sort based on marks \n 2. sort based on names");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==1) {
		System.out.println("sort according to marks");
		Collections.sort(students,new MarskComparator());
			display();
		}else if(choice==2) {
			System.out.println("sort according to marks");
			Collections.sort(students,new NameComparator());				
					display();
		}
		
	}
}