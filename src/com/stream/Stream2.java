package com.stream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

class Coffee{
	String coffeeName;
	int price;
	public String getCoffeeName() {
		return coffeeName;
	}
	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Coffee(String coffeeName, int price) {
		super();
		this.coffeeName = coffeeName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Coffee [coffeeName=" + coffeeName + ", price=" + price + "]";
	}
	
}

public class Stream2 {

	public static void main(String[] args) {
		List<Coffee> c=Arrays.asList(new Coffee("Espresso",200),
				new Coffee("Latte",250),
				new Coffee("Regular",350),
				new Coffee("Black",275),
				new Coffee("Ceylon",350),
				new Coffee("Cold Coffee",166),
				new Coffee("Coffee with cream",500));
		
		Stream<Coffee> cs= c.stream();
		Predicate<Coffee> filterByPrice= (e)-> e.getPrice()>200;
		Function<Coffee, String> display= (e)-> e.getCoffeeName().toUpperCase()+","+ e.getPrice();
		
		cs.filter(filterByPrice).map(display).
		forEach((e)-> System.out.println(e));
		

	}

}
