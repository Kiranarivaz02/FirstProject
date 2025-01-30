package com.Exception;
//checked
import java.io.FileInputStream;
import java.io.FileNotFoundException;///
import java.io.IOException;///

public class FileDemo {
	public static void main(String args[]) {
		try {
			FileInputStream fs = new FileInputStream("myfile.txt");
			byte[] bt = new byte[10];
		fs.read(bt);
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	catch(IOException e) {
		System.out.println("Input Output error");
	}
}
}
 
 
//checked exception forces to handle the exception at compile time\
 