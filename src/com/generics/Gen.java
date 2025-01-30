//create a method which can take any type of data and return same
package com.generics;

class Data <M> // generic
{
	//design 1
	/*void accept(Object obj) {
		System.out.println(obj);
		
	}
	//design 2
	Object getData(Object obj) {
		return obj;
     }*/
	void accept(M obj) {
	    System.out.println(obj);
		System.out.println(obj.getClass().getName());
	}
}
public class Gen {

	public static void main(String[] args) {
		/*Data d=new Data();
		d.accept(100);
		d.accept("kiran");
		d.accept(null);
		d.accept(688.999);
		d.accept(677.8f);
		d.accept(true);*/
		Data<String> d=new Data<String>();
		d.accept("kiran");
		
		//Object obj=d.getData("String");
		//System.out.println(obj);
		

	}

}
