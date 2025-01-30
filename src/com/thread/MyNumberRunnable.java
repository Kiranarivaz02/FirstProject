package com.thread;

public class MyNumberRunnable implements Runnable {
	static int i=0;
	public void run() {
		for(i=0;i<10;i++) {
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		System.out.println(i);
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumberRunnable obj=new MyNumberRunnable();
		Thread t1= new Thread(obj);
		//Thread t2= new Thread(obj);
		t1.start();
		//t2.start();
/* methods:
		start()
		run()
		getName()
		setName()
		currentThread()
		getPriority()
		setPriority()
		isAlive()
		join()
		*/

	}

}
