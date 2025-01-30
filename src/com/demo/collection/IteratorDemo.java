

package com.demo.collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> al = new ArrayList<>();
		al.add(10);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(80);
		//al.add("sss"); // Type-Safe- Generics because of Integer
		
		System.out.println("Array List:" + al);

		 System.out.println("Using enchnced for"); 
		  for(Object o:al)
		  {
		  System.out.println(o); 
		  //al.add(70);
		  
		  } 
		  
		  
			
			 /* System.out.println("Using regular for");
			  
			  for(int i=0;i<al.size();i++) 
			  {
			  
			  
			  System.out.println(al.get(i)); 
			  al.add(990);
			  
			  }
			  */
		  
	
			  
			  System.out.println("Using iterator");
			  	  
			  Iterator it=al.iterator();
			  
			  while(it.hasNext()) {
				  //Integer str=(Integer)it.next(); 
				  		  System.out.println(it.next());
			 
			  
			  
			 }
			  
			  
System.out.println("Using List Iterator");

ListIterator listiterate= al.listIterator();


while(listiterate.hasNext())
{
	System.out.println(listiterate.next());
}

System.out.println("Using List Iterator in reverse orer");

while(listiterate.hasPrevious())
{
	System.out.println(listiterate.previous());
}




	}

}