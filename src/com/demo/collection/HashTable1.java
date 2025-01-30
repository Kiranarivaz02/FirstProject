package com.demo.collection;
public class HashTable1 {
 
		private String[] keys;
		private String[] values;
		private int capacity;
		
		public HashTable1(int capacity) {
			this.capacity = capacity;
			keys = new String[capacity];
			values = new String[capacity];
		}
		
		private int hash(String key) {
			return Math.abs(key.hashCode() % capacity);
		}
		
		public void put(String key, String value) {
			int index = hash(key);
			while(keys[index] != null) {
				if(keys[index].equals(key)) {
					values[index] = value;
					return;
				}
				index = (index + 1) % capacity; //Linear probing
			}
			keys[index] = key;
			values[index] = value;
		}
		
		public String get(String key) {
			int index = hash(key);
			while(keys[index] != null) {
				if(keys[index].equals(key)) {
				return values[index]; //Return value if the key is found
				}
				index = (index + 1) % capacity; //continue probing
			}
			return null;
		}
		
		public void remove(String key) {
			int index = hash(key);
			while(keys[index] != null) {
				if(keys[index].equals(key)) {
				keys[index] = null;//Remove the key
				values[index] = null;//Remove the value
				return;
				}
				index = (index + 1) % capacity; //continue probing
			}
		}
public void display() {
	for(int i=0;i<capacity;i++) {
		if(keys[i]!=null) {
			System.out.println("Index "+i+ ": [" +keys[i]+": "+values[i]+"]");
		}
	}
}
public static void main(String[] args) {
	HashTable1 obj=new HashTable1(5);
	obj.put("1","Peter");
	obj.put("2","sam");
	obj.put("3","erric");
	obj.put("4","William");
	obj.put("5","Simond");
	System.out.println(obj.get("1"));
	System.out.println(obj.get("2"));
	System.out.println(obj.get("3"));

	System.out.println(obj.get("4"));

	System.out.println(obj.get("5"));
//key unique but value can be same
	
//same input gives same output called pure function.. used to create hash function
}
}

