package com.thread;

public class SynchronizedRunnable implements Runnable {
	public void run() {
		//code does not come under synchronized block will be executed by both threads immediately
		System.out.println(Thread.currentThread().getName());
		synchronized(this) {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		}
	}
	/*public synchronized void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+","+i);
		}
	}*/

	public static void main(String[] args) {
		SynchronizedRunnable runnable= new SynchronizedRunnable();
		Thread t1= new Thread(runnable);
		Thread t2= new Thread(runnable);
		t1.start();
		t2.start();
		

	}

}
