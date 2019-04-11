package com.mphasis.training.jbdcprogramming;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.mphasis.training.util.DbUtil;

public class BatchProcessingExample {

	public static void main(String[] args) throws SQLException {
	Connection con=DbUtil.getConnection();
		try {
		con.setAutoCommit(false);
		Statement st=con.createStatement();
	String sql1="insert into product values(47,'bottle',234,78)";
	String sql2="insert into product values(48,'mouse',2346,78)";
	String sql3="insert into product values(49,'watch',12234,78)";
		st.addBatch(sql1);
		st.addBatch(sql2);
		st.addBatch(sql3);
		st.executeBatch();
		con.commit();	
		System.out.println("done");
		}catch(SQLException e) {
			con.rollback();
			e.printStackTrace();
		}

	}

}
