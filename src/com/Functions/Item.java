package com.Functions;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.Collections;
import java.util.function.*;


public class Item {
	private int itemId;
	private String itemName;
	private double price;
	

	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Item(int itemId, String itemName, double price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + "]";
	}


	public static void main(String[] args) {
		
		//Create a list of items using array list
		List<Item> list= new ArrayList<>();
		list.add(new Item(101, "Soap", 10));
		list.add(new Item(102, "Sampoo", 300));
		list.add(new Item(103, "Choco", 56));
		list.add(new Item(104, "Brush", 78));
		list.add(new Item(105, "Rin", 89));
		System.out.println(list);
		
		//display the object which price > 200 using predicate
		
		   Predicate<Item> pred = item -> item.getPrice() > 200;
		   System.out.println("Items with price greater than 200:");
	        for (Item a : list) {
	            if (pred.test(a)) {
	                System.out.println(a);
	            }
	        }
        
        //display item name with price for each object  eg: " Price for coffee ---> 300 use consumer
		/*Consumer<Item> displayItem = item ->
        System.out.println("Price for " + item.getItemName() + " --> " + item.getPrice());
        list.forEach(displayItem);
        */
        System.out.println("----------------------------------------------------------");
        Consumer<Item> con = item -> {
            System.out.println("Price for " + item.getItemName() + "---->" + item.getPrice());
        };
        for (Item a : list) {
            con.accept(a);
        }
        
        
        //calculate discount of 5% over price for each items (use supplier)
        
        System.out.println("----------------------------------------------------------");
        System.out.println("\nApplying 5% discount:");
        list.forEach(item -> {
            Supplier<Double> discountSupplier = () -> item.getPrice() * 0.95;
            System.out.println(item.getItemName() + " discounted price: " + discountSupplier.get());
        });
        
        
        //sort item object as per name and then as price 
       /* List<Item> sortedItems = list.stream()
                .sorted(Comparator.comparing(Item::getItemName)
                        .thenComparing(Item::getPrice))
                .collect(Collectors.toList());
 
        System.out.println("\nSorted Items by name and price:");
        sortedItems.forEach(System.out::println);*/
        
        System.out.println("----------------------------------------------------------");

        
        Collections.sort(list, new Comparator<Item>() {
            @Override
            public int compare(Item item1, Item item2) {
                int nameComparison = item1.getItemName().compareTo(item2.getItemName());
                if (nameComparison != 0) {
                    return nameComparison;
                } else {
                    return Double.compare(item1.getPrice(), item2.getPrice());
                }
            }
        });

        // Print the sorted items
        System.out.println("\nSorted Items by name and price:");
        for (Item item : list) {
            System.out.println(item);
        }
		

	}

}
