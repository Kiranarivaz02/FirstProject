package com.thread;
//wait is called in synchronized
public class CabService implements Runnable {
	
	public synchronized void run() {

		String threadname=Thread.currentThread().getName();
		System.out.println("Service started for ...");
		System.out.println(threadname);

		try {
				wait();
		}
		catch (InterruptedException e) {

				e.printStackTrace();
		}
		
		System.out.println("Service stopped for "+threadname);
	}

	public synchronized void stopservice()
	{
		notify();
	}
	public synchronized void stopAllService()
	{
		notifyAll();
	}

	public static void main(String args[]) {
			
		CabService obj= new CabService();
		Thread t= new Thread(obj);
		Thread t1=new Thread(obj);
	      t.start();
	      t1.start();
	      try{
	        Thread.sleep(1000);
	      }
	      catch(Exception e) 
	      { 
	      }
	   //obj.notifyAllThread();
			
		}
		}

 

