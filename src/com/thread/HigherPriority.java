package com.thread;

public class HigherPriority extends Thread{
	
	String[] sc= {"wed--Meeting","fri--Training","Mon- Client Meet"};
	public void run() {
		Thread.yield();
		for(String s: sc) {
			
			System.out.println(Thread.currentThread().getName());
			System.out.println(s);
		}
	}
	public static void main(String args[]) {
		
		HigherPriority t1=new HigherPriority();
		t1.setName("Client 1");
		HigherPriority t2=new HigherPriority();
		t2.setName("Client 2");
		HigherPriority t3=new HigherPriority();
		t3.setName("Client 3");
		HigherPriority t4=new HigherPriority();
		t4.setName("Client 4");


		
		t1.setPriority(4);
		t1.setPriority(7);
		t1.setPriority(8);
		t1.setPriority(9);
		t4.start();
		t3.start();
		t2.start();
		t1.start();
	}
}
