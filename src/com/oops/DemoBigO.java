package com.oops;
public class DemoBigO {

	public static void main(String[] args) {
		long starttime;
		long endtime;
		long elapsedtime;
		int input=100;
		
		//First Phase
		starttime=System.nanoTime();
		int res=add(input);
		endtime=System.nanoTime();
		elapsedtime=endtime-starttime;
		System.out.println("Result is:"+ res + "Took:"+ elapsedtime+ " nsecs");
		
		//second Phase
		starttime=System.nanoTime();
		int res1=add_again(input);
		endtime=System.nanoTime();
		elapsedtime=endtime-starttime;
		System.out.println("Result is:"+ res1 + "Took:"+ elapsedtime+ " nsecs");
	}//end of main
	
	//O(n)
	static int add(int input) {
		int sum=0;
		for(int i=0;i<=input;i++) {
			sum+=1;
		}
			return sum;
		
	}	//end of add

	
	//O(1)
	static int add_again(int input) {
		int sum=0;
			sum=input*(input+1/2);
			return sum;
		}//end of add_again
	
	

}
