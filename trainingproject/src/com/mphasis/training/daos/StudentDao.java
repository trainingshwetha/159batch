package com.mphasis.training.daos;
import java.util.*;
import com.mphasis.training.pojos.Student;
public class StudentDao {
	private List<Student> students=null;
	public StudentDao() {
		students=new ArrayList<>();
		Student s1=new Student(21, "Saranya", 78);
		Student s2=new Student(24, "Bindu", 87);
		Student s3=new Student(25, "Ashwini", 83);
		Student s4=new Student(23, "Krishnaveny", 89);
		Student s5=new Student(27, "Hema", 76);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
	}
	
	public List<Student>  getAllStudent() {
		return students;
	}

}