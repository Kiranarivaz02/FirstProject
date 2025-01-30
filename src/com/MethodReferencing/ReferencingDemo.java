
//
package com.MethodReferencing;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface IMessage{
	void printMessage();
}
class HelloMessenger{
	
	public HelloMessenger() {
		System.out.println("Hello from instance");
	}
	public static void displayMessage() { //static
		System.out.println("Hello World");
	}
}

public class ReferencingDemo {

	public static void main(String[] args) {
		/*HelloMessenger msg= new HelloMessenger();
		IMessage m= msg::displayMessage; */ //non static
		
		IMessage m= HelloMessenger::new;//static
		m.printMessage();
		
		
		List<Integer>  numlist= Arrays.asList(12,3,23,45,78,79,30);
		Consumer<Integer> consumer= System.out::println;
		numlist.forEach(consumer);

	}

}
