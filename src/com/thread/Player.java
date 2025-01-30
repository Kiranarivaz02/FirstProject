package com.thread;
//parallel
public class Player extends Thread {
	public void run() {
		String[] player_name= {"Peter","Erric","Sam","Michel","Andrew","William"};
		for(String i:player_name) {
			if(Thread.currentThread().getName().equals("player"))
			{
			System.out.println(i);
			}
			else
			{
				System.out.println("Welcome to arena");
			}
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
		
	}
	}
	
	public static void main(String args[]) {
		Player p1 = new Player();
		p1.setName("player");
		Player p2 = new Player();
		p2.setName("welcome");
		p1.start();
		p2.start();
		
	}
 
}
 
