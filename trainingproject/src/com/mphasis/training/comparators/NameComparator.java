package com.mphasis.training.comparators;

import java.util.Comparator;

import com.mphasis.training.pojos.Student;

public class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student st1, Student st2) {
		return st1.getSname().compareTo(st2.getSname());
	}

}
