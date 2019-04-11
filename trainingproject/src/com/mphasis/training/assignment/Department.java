package com.mphasis.training.assignment;

public class Department implements Comparable<Department> {
private int deptid;
private String dname;
public Department(int deptid, String dname) {
	super();
	this.deptid = deptid;
	this.dname = dname;
}
@Override
public String toString() {
	return "deptid=" + deptid + ", dname=" + dname ;
}
@Override
public int compareTo(Department d) {
	if(this.deptid>d.deptid) return -1;
	else if(this.deptid<d.deptid) return 1;
	else return 0;
}

}
