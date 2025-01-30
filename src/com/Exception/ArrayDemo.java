package com.Exception;
//unchecked
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,89,884,56,23,45,99,46};
		for(int i=0;i<arr.length;i++) {
			try {
				System.out.println(arr[i]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index over reach");
			}
			finally {
				System.out.println("end");
			}
		}

	}

}
