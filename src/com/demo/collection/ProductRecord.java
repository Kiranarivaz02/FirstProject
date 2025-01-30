package com.demo.collection;
import java.util.*;
import java.util.TreeSet;

class Product{
	private String productName;
	private float price;
	public Product(){}
	
	public String getProductName() {
		return productName;
	}
	
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	

	@Override
	public String toString() {
		return "Product[productName=" +productName + ", price=" + price+"]";
	}

	public Product(String productName, float price) {
		super();
		this.productName = productName;
		this.price = price;
	}
	
}
public class ProductRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator <Product> comaparator=(p1,p2)->
		p1.getPrice()!=p2.getPrice()? p1.getPrice()> p2.getPrice()? 1 : -1 :0;
		TreeSet<Product> treeset= new TreeSet<>(comaparator);
		treeset.add(new Product("Coffee",120));
		treeset.add(new Product("Ice Tea",200));
		treeset.add(new Product("Tea",110));
		treeset.add(new Product("Black Coffee",150));
		System.out.println(treeset);

	}

}
