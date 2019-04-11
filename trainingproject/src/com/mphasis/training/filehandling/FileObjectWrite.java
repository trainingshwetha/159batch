package com.mphasis.training.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileObjectWrite {

	public static void main(String[] args)throws IOException {
		
		FileOutputStream fos
=new FileOutputStream("employeedate.txt",true);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Employee e=new Employee(19, "Narendar Modi", "Delhi", 67576);
		oos.writeObject(e);
		oos.close();
		fos.close();
		System.out.println("done");

	}

}
