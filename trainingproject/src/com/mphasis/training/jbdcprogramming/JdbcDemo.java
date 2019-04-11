package com.mphasis.training.jbdcprogramming;

import java.lang.invoke.CallSite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mphasis.training.util.DbUtil;

public class JdbcDemo {

	public static void main(String[] args){
		try {
		Connection con=DbUtil.getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select empno,ename from employee");
		while(rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2));	
		}
		System.out.println("connected");
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
