package com.FileStream;
import java.io.*;
import java.io.FileOutputStream;

public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout= new FileOutputStream("d://myfile.txt");
			fout.write("Hello from program".getBytes());
			fout.flush();
			fout.close();
		}
		catch(Exception e) {
			
		}

	}

}
