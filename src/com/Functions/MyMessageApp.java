package com.Functions;

public class MyMessageApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message message=()-> System.out.println("Hello World"); //Lambda function
		message.printMessage();
		
		IMath imath=(a,b) -> System.out.println(a+b);
		imath.calculate(12,9);
		
		IMath imath1=(a,b) -> System.out.println(a-b);
		imath1.calculate(12,9);
		
		IInterest i=(p,n,r)->(p*n*r)/100;
		double result= i.getInterest(12000,2,3);
		System.out.println(result);
		
		IInterest i1=(p,n,r)->{
			System.out.println("Principle: "+p); //multiline lambda expression // print in interface
			System.out.println("Time: "+n);
			System.out.println("Rate: "+r+"\n"+"SI:");
			return (p*n*r)/100;

		};
		double result2= i1.getInterest(1000,29,33);
		System.out.println(result2);

	}
	

}
