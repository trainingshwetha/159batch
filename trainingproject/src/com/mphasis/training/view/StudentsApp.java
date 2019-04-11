package com.mphasis.training.view;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.mphasis.training.comparators.MarskComparator;
import com.mphasis.training.comparators.NameComparator;
import com.mphasis.training.daos.StudentDao;
import com.mphasis.training.pojos.Student;

public class StudentsApp {
	private static StudentDao studentDao=new StudentDao();
	static List<Student> students=studentDao.getAllStudent();
	
	public static void display() {
		System.out.println("list of students");
		for(Student s:students) {
			System.out.println(s.getSt_id()+" "+s.getSname()+" "+s.getMarks());
		}
	}
	
	public static void main(String args[]) {	
		System.out.println("welcome to our app");
		display();
		
		Collections.sort(students);
		display();
		
		Collections.sort(students,new MarskComparator());
		display();
		
		Collections.sort(students,new NameComparator());
		display();	
		
//		
//		 double marks = students.stream()   
//		          .collect(Collectors.averagingInt(s->s.getMarks()));  
//		      System.out.println("Average marks of Students is: "+marks);
	}
}