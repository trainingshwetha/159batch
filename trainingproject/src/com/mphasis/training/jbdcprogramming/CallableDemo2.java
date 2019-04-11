package com.mphasis.training.jbdcprogramming;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.mphasis.training.util.DbUtil;

public class CallableDemo2 {
	public static void main(String[] args) {
		try(Connection con=DbUtil.getConnection()){
		CallableStatement cs=
		con.prepareCall("{call emp_salary_increase1(?,?)}");
		cs.setInt(1, 113);
		cs.registerOutParameter(2, java.sql.Types.DECIMAL);
		cs.executeUpdate();
		double sal=cs.getDouble(2);
		System.out.println("Incremented salary is"+sal);
			System.out.println("done");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
