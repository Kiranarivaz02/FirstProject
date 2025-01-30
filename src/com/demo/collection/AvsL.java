package com.demo.collection;
import java.util.ArrayList;
import java.util.LinkedList;
 
public class AvsL {
	public static void main(String arg[]) {
		long starttime;
		long endtime;
		long elapsedtime;
		
		ArrayList <Integer> al = new ArrayList();
		LinkedList <Integer> link= new LinkedList();
		
		for(int i=0;i<100000;i++) {
			al.add(i);
			link.add(i);
			
		}
		
		starttime = System.nanoTime();
		al.get(666);
		endtime=System.nanoTime();
		elapsedtime=endtime-starttime;
		System.out.println("Time taken by Array List is:"+elapsedtime);
		
		starttime=System.nanoTime();
		link.get(666);
		
		endtime=System.nanoTime();
		elapsedtime=endtime-starttime;
		System.out.println("Time taken by Linked List is:"+elapsedtime);
		
		
	}
	
}
