package com.mphasis.training.jbdcprogramming;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowsetExample {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		JdbcRowSet rowSet=RowSetProvider.
				newFactory().createJdbcRowSet();
		rowSet.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		rowSet.setUsername("shwe");
		rowSet.setPassword("123");
		System.out.println("connected");
		
		rowSet.setCommand("select * from product");
		rowSet.execute();
		
		while(rowSet.next()) {
			System.out.println(rowSet.getInt(1));
		}
		
		
	}

}
