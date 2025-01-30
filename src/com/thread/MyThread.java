package com.thread;
//create a thread
public class MyThread extends Thread {
	public void run() {
		System.out.println("thread started");
	}

	public static void main(String[] args) {
		MyThread th=new MyThread();
		th.start();

	}

}
