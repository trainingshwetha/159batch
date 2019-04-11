package com.mphasis.training.comparators;

import java.util.Comparator;

import com.mphasis.training.pojos.Student;

public class MarskComparator implements Comparator<Student> {

	@Override
	public int compare(Student st1, Student st2) {
		if(st1.getMarks()> st2.getMarks())
				return -1;
		else if(st1.getMarks()<st2.getMarks())
				return 1;
		else
				return 0;
	}

}
