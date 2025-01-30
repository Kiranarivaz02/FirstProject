// lets create a method which should allow us to store only numerical values 
package com.generics;
class StoreNumericsOnly<M extends Number>
{
	
	void acceptNumbers(M m)
	{
		
System.out.println("What Type:"+m +" "+m.getClass().getName());

	}
	
}


public class BoundGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StoreNumericsOnly obj= new StoreNumericsOnly();
		obj.acceptNumbers(100.5f);
		obj.acceptNumbers(100.577);
		obj.acceptNumbers(100);
		
		//obj.acceptNumbers("Java");
		
		
		
	
		
		
	}

}
