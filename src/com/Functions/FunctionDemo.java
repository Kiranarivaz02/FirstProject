package com.Functions;
import java.util.function.Function;

public class FunctionDemo {
	public static void printLength(Function<String,Integer> function, String Str)
	{
		System.out.println(function.apply(Str));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printLength((Str)-> Str.length(), "Hello World");
		printLength((Str)->(int) Str.toCharArray()[0], "Hello World");
		printLength((Str)-> Str.split(" ").length, "Hello World");


	}

}
