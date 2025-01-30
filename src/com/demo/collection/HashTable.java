package com.demo.collection;
import java.util.Hashtable;
public class HashTable {

	public static void main(String[] args) {
		Hashtable<String, Integer> hashtable= new Hashtable<>();
		hashtable.put("Alice", 30);
		hashtable.put("Bob", 25);
		hashtable.put("Charlie", 35);
		System.out.println("Alice's age "+ hashtable.get("Alice"));
		if(hashtable.containsKey("Bob")) {
			System.out.println("Bob's age "+ hashtable.get("Bob"));

		}
		hashtable.remove("Charlie");
		System.out.println("Charlie's age after removal: "+ hashtable.get("Charlie"));
	}

}
