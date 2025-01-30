package com.Functions;
class MyMessageApp2{
public void calculateInterest(IInterest i2) {
	double result3= i2.getInterest(109,9,5);
	System.out.println(result3);
	}
	public static void main(String [] args) {
	MyMessageApp2 obj= new MyMessageApp2();
	obj.calculateInterest((p,n,r)->(p*n*r)/100);
	}
}