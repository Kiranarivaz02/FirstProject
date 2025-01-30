package com.demo.collection;

import java.util.Comparator;
import java.util.TreeSet;

class Order  implements Comparable<Order>
{
	int orderid;
	int qty;
	int price;

	public Order(int orderid, int qty, int price) {
		super();
		this.orderid = orderid;
		this.qty = qty;
		this.price = price;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", qty=" + qty + ", price=" + price + "]";
	}

	
	  @Override public int compareTo(Order o) { // TODO Auto-generated method stub
	  
	  if(this.orderid >o.orderid ) { return 1;
	  
	  } else if(this.orderid < o.orderid ) return -1; else return 0;
	  
	  
	  }
	 

}

// Using Comparator

class sortbyprice implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {
		// TODO Auto-generated method stub

		if (o1.price > o2.price) {
			return 1;

		} else if (o1.price < o2.price)
			return -1;
		else
			return 0;
	}

}

public class AddingCustomObjectstoTreeSet {

	public static void main(String[] args) {

		
		  TreeSet <Order> tr=new TreeSet<>(); 
		  tr.add(new Order(11, 80,4000));
		  tr.add(new Order(21, 76,3000));
		  tr.add(new Order(45, 34,1000));
		  System.out.println(tr);
		 

		System.out.println(" Below is for Price ");
		// Sorting by comparator

		TreeSet<Order> tr1 = new TreeSet<>(new sortbyprice());
		tr1.add(new Order(11, 80, 4000));
		tr1.add(new Order(21, 76, 3000));
		tr1.add(new Order(45, 34, 1000));
		System.out.println(tr1);

	}

}
