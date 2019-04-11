package com.mphasis.training.jbdcprogramming;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.mphasis.training.util.DbUtil;

public class ResultSetExamples {

	public static void main(String[] args) {
		try {
			Connection con=DbUtil.getConnection();
			
			DatabaseMetaData dbmeta=con.getMetaData();
			System.out.println(dbmeta.getDatabaseProductName());
			System.out.println(dbmeta.getDatabaseProductVersion());
			System.out.println(dbmeta.getNumericFunctions());
			/*
			Statement st=con.createStatement(
				ResultSet.TYPE_SCROLL_SENSITIVE,
				ResultSet.CONCUR_UPDATABLE
				);
			ResultSet rs=st.executeQuery("select pid,pname,cost,quantity from product");
			rs.moveToInsertRow();
			rs.updateInt(1, 55);
			rs.updateString(2, "mobile");
			rs.updateDouble(3, 6468);
			rs.updateInt(4, 67);
			rs.insertRow();
			//reverse direction
			rs.afterLast();
			while(rs.previous()) {
				System.out.println(rs.getInt(1)+""
						+ " "+rs.getString(2));
			}
			
			ResultSetMetaData meta=rs.getMetaData();
			System.out.println(meta.getColumnCount());
			
			*/System.out.println("done");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

}
