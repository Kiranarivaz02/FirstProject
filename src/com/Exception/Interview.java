package com.Exception;

 class AgeException extends Exception {
	int age;
	
	public AgeException(int age) {
		super("invalid age "+age);
		this.age=age;
	}
	public String toString() {
		return age+" is not appropriate value";
	}
}
public class Interview{
	public int checkAge(int age) throws AgeException // flag
	{
		if(age<23) {
			throw new AgeException(age);
		}
		else {
			return age;
		}
	}

	public static void main(String[] args) {
		
		try {
			
			Interview a=new Interview();
			a.checkAge(10);
			
			System.out.println("Eligible");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}