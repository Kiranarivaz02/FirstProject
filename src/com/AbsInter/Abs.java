package com.AbsInter;

abstract class Abdemo{
	int a=10;

    Abdemo() {
    	
    }
    void dis()
    {
    	System.out.println( "Implement abstrct");
    }
    abstract void print();
}

class RegularClass extends Abdemo{
     void print() {
	    System.out.println("Implement regclass "+ a);
     }
	
}
class Abs{

	public static void main(String[] args) {
		//can't instantiate abstract class so we are using reference of regular class
		Abdemo abs=new RegularClass();
		abs.print();
		abs.dis();

	}

}
