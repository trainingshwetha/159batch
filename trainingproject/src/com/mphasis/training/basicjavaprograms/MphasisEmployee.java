package com.mphasis.training.basicjavaprograms;

public class MphasisEmployee {
	private int empid;
	private String ename;
	private Address address=new Address();
		
	public MphasisEmployee(int empid,String ename,Address address) {
		this.empid=empid;
		this.ename=ename;
		this.address=address;
	}

	@Override
	public String toString() {
		return "empid=" + empid + ", ename=" + ename + ""
				+ ", address=" + address + "";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + 
				((address == null) ? 0 : address.hashCode());
		result = prime * result + empid;
		result = prime * result + 
				((ename == null) ? 0 : ename.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MphasisEmployee other = (MphasisEmployee) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (empid != other.empid)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		return true;
	}

	public boolean equals(MphasisEmployee e1) {
		if(this.empid == e1.empid) {
			if(this.ename.equals(e1.ename)) {
				return true;
			}
			else {
				return false;
			}
		}
			else {
				return false;
			}
	}

	
	
	
	
//	public void getMphasisEmployeeDetails() {
//		System.out.println(empid+ " "+ename) ;
//		System.out.println(address);
//	}
	

}
