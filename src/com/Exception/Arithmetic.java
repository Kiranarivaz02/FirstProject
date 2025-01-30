package com.Exception;

public class Arithmetic implements AutoCloseable {
	public void close() {
		System.out.println("resource closed");
    }
	public void divide(int a, int b) {
		System.out.println(a/b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Arithmetic obj =new Arithmetic()){
			obj.divide(12, 0);
		}
		catch(ArithmeticException e) {
			System.out.println("Can't divide by 0");
		}
	
		
	}

}
