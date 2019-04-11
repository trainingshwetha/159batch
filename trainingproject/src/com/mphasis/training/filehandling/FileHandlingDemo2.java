package com.mphasis.training.filehandling;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingDemo2 {
	public static void main(String args[])throws IOException {
		
		FileOutputStream fos=new FileOutputStream("mytext1.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeInt(23);
		dos.writeDouble(3667.3);
		dos.writeUTF("any string");
		dos.writeChar(4);
		dos.close();
		System.out.println("done");
	}

}
