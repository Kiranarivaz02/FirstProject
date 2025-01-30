package com.FileStream;

import java.io.*;
public class RandamAccessDemo {
	public static void main(String args[]) throws Exception
	{
		RandomAccessFile rf=new RandomAccessFile("myfile.txt","rw");
				
		rf.writeBytes("hello world");
		rf.seek(15);
		rf.writeBytes("welcome");
		rf.seek(0);
		byte[] bt=new byte[20];
		rf.readFully(bt);
		System.out.println(new String(bt));
	}
 
}