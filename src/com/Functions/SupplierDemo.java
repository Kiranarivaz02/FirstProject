package com.Functions;
import java.util.function.Supplier;
public class SupplierDemo {
	public static int getLength(Supplier<Integer> supplier) {
		return supplier.get();
		}
	

	public static void main(String[] args) {
		System.out.println(getLength(()-> "Hello World".length()));
		System.out.println(getLength(()->new int[] {12,45,23,6,34,9}.length));
		System.out.println(getLength(()-> 12*23));

	}

}
