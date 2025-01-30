package com.Functions;
import java.util.function.*;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> predicate=(num)-> num%2==0;
		
		System.out.println(predicate.test(101));
		System.out.println(predicate.test(200));
		System.out.println(predicate.test(203));
		System.out.println(predicate.test(104));
		
		
		int[] arr= {12,3,56,34,67,89,23};
		for(int a:arr) {
			System.out.println(a);
			if(predicate.test(a)) {
				System.out.println("is even");
			}
			else {
				System.out.println("is odd");
			}
		}


	}

}
