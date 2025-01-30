package com.demo.collection;
import java.util.*;

public class Collect {

	public static void main(String[] args) {
		//lets create a list(collection type) 
		//hetero data can be stored 
		//all data will store in single object
		//default array size is 10
		List ref=new ArrayList();
		ref.add("Kiran");
		ref.add(7665.899);
		//ref.add(new Integer(2025));
		ref.add(785);
		ref.add(true);
		//insert at 2 index
		ref.set(2, "girl");
		ref.add(new Integer(2025));

		ref.add("Kir");
		ref.add(7665.8);
		ref.add(new Integer(25));
		ref.add(5);
		ref.add(false);
		ref.add("hi");
		ref.add(2,"hi");
		System.out.println(ref);

		
				
		

	}

}
