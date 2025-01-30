package com.thread;

public class ThreadDemo extends Thread{
	public void run() {
		String name= this.getName();
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Thread Started "+name);
	}

	public static void main(String[] args) {
		ThreadDemo th= new ThreadDemo();
		th.setName("First Name");
		ThreadDemo th1= new ThreadDemo();
		th1.setName("Second Name");
		th.start();
		th1.start();
		
		// new thread (start)- Runnable(run) - Running(sleep,wait)(end) - Waiting (end)
	}

}
