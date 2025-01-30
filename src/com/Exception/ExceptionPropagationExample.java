package com.Exception;

public class ExceptionPropagationExample {
	public static void main(String[] args) {
		try {
			methodA();
		} catch(Exception e) {
			System.out.println("Caught in main: "+ e.getMessage());
		}
	}
	public static void methodA() {
		methodB();
	}
	public static void methodB() {
		methodC();
	}
	public static void methodC() {
		throw new RuntimeException("An error occurred in method");
	}
 
}

