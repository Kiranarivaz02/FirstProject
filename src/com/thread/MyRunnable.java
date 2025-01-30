package com.thread;

public class MyRunnable implements Runnable {

	public void run() {
		System.out.println("thread with runnable instance started");
	}

	public static void main(String[] args) {
		Thread th=new Thread(new MyRunnable());
		th.start();

	}

}

