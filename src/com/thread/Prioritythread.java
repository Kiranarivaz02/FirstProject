package com.thread;

public class Prioritythread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			if(Thread.currentThread().getPriority()<Thread.NORM_PRIORITY) {
				Thread.yield();
			}
			else
			{
				System.out.println(Thread.currentThread().getName());
			}
			try {
				Thread.sleep(2000);
			}
			catch(Exception e){
				System.out.println(e);
			}
			}
		}
		public static void main(String args[]) {
			Prioritythread t1=new Prioritythread();
			Prioritythread t2=new Prioritythread();
			Prioritythread t3=new Prioritythread();
			Prioritythread t4=new Prioritythread();
			t1.setPriority(3);
			t1.setPriority(4);
			t1.setPriority(5);
			t1.setPriority(7);
			t4.start();
			t3.start();
			t2.start();
			t1.start();
		}
	}
