package com.Exception;

public class MyException {
	public void checkAge(int age) throws Exception {
		if(age<18) {
			throw new Exception("Age less than 18");
		}
		else {
			System.out.println("candidate is eligible");
		}
	}

	public static void main(String[] args) {
		try {
			MyException obj=new MyException();
			obj.checkAge(15);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
	}

}
