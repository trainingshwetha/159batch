package com.mphasis.training.jbdcprogramming;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mphasis.training.util.DbUtil;

public class JdbcBlobClob {

	public static void main(String[] args)throws IOException{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the student details:\n "
			+ "1.id \n 2.name\n 3.salary\n"
			+ "4.addressdoc \n 5.photo");
	int id=sc.nextInt();
	String name=sc.next();
	double salary=sc.nextDouble();
	String file=sc.next();
	File f=new File(file);
	FileReader fr=new FileReader(f);
	String photo=sc.next();
	FileInputStream fs=new FileInputStream(photo);
	try {
		Connection con=DbUtil.getConnection();
		String sql="insert into employee_data values(?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setDouble(3, salary);
		pst.setCharacterStream(4, fr, (int)f.length());
		pst.setBinaryStream(5, fs, fs.available());
		int i=pst.executeUpdate();
		System.out.println("Record inserted"+i);
	}catch(SQLException e) {
		e.printStackTrace();
	}
	}
}