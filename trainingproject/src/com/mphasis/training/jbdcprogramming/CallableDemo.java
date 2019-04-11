package com.mphasis.training.jbdcprogramming;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.mphasis.training.util.DbUtil;

public class CallableDemo {

	public static void main(String[] args) throws SQLException {
	
		try(Connection con=DbUtil.getConnection()){
			CallableStatement cst=
				con.prepareCall("{call insertproduct(?,?,?,?)}");
			cst.setInt(1, 35);
			cst.setString(2, "Powder");
			cst.setDouble(3, 345);
			cst.setInt(4, 789);	
			cst.executeUpdate();
			System.out.println("done");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
