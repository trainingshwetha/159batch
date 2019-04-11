package com.mphasis.training.jbdcprogramming;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mphasis.training.util.DbUtil;

public class JdbcClobBlobRetrival {

	public static void main(String[] args)throws IOException {
		try {
			Connection con=DbUtil.getConnection();
			 Statement st=con.createStatement();
			 ResultSet rs=
				st.executeQuery("select * from employee_data");
			  while(rs.next()) { 
				  System.out.println(rs.getInt(1)+
						  " "+rs.getString(2)+" "
						  + rs.getFloat(3));	
				  String s=rs.getString(4);
				  System.out.print(s);
				  Blob b=rs.getBlob(5);
				  byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
FileOutputStream fs=new FileOutputStream("D:\\images\\down.jpg");
				  fs.write(barr);
			  }
			  }catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
