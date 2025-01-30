/* Write a Program to find the largest and smallest from gien array {12,23,11,19,55,27,32,16} */

// O(n)
package com.oops;
public class ArraySmallLarge {
	static int findMax(int numbers[]) {
		int largetst = numbers[0];
		 for (int i = 1; i < numbers.length; i++) {
			   if (numbers[i] > largetst)
			    largetst = numbers[i];
		 }
		 return largetst;
	}
	static int findMin(int numbers[]) {
		int smallest = numbers[0];
		 for (int i = 1; i < numbers.length; i++) {
			   if (numbers[i] < smallest)
				   smallest = numbers[i];
		 }
		 return smallest;
		
		
	}

	public static void main(String[] args) {
		int[] numbers={12,23,11,19,55,27,32,16};
		  /*int smallest = numbers[0];
		  int largetst = numbers[0];

		  for (int i = 1; i < numbers.length; i++) {
		   if (numbers[i] > largetst)
		    largetst = numbers[i];
		   else if (numbers[i] < smallest)
		    smallest = numbers[i];
		  }*/
		System.out.println("Largest Number is : " +findMax(numbers));
		System.out.println("Smallest Number is : " +findMin(numbers));


	}

}
