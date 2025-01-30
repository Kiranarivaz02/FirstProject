package com.stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class StreamDemo {

	public static void main(String[] args) {
		//To implement stream
		IntStream numberStream= IntStream.of(12,22,11,44,5,66,26,93,71);
		numberStream.forEach((e)-> System.out.println(e));
		
		
		Stream.Builder<String> streamBuilder= Stream.builder();
		streamBuilder.add("Router");
		streamBuilder.add("Switch");
		streamBuilder.add("Cables");
		streamBuilder.add("BTS");
		streamBuilder.add("BSC");
        Stream stream = streamBuilder.build();
        stream.forEach((e)-> System.out.println(e));
        
        
        
        List<String> nameList= Arrays.asList("Peter","erric","Mathew","Seshu","Kiran","Li");
        Stream<String> namestream=nameList.stream();
       // namestream.filter((e)-> e.length()>=3).forEach((e)-> System.out.println(e)); or
        
     //   namestream.map((e)-> e.toUpperCase()).forEach((e)-> System.out.println(e)); or join both
        
        namestream.filter((e)-> e.length()>=3).
        map((e)->e.toUpperCase()).
        forEach((e)-> System.out.println(e));
 

	}

}
