package com.FileStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 
class Products implements Serializable
{
	private String ProductName;
	private float price;
	private int quantity;
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String ProductName) {
		this.ProductName = ProductName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getquantity() {
		return quantity;
	}
	public void setquantity(int quantity) {
		this.quantity=quantity;
	}
}
class Product1 {
	public void saveProduct1(Products pr) throws IOException
	{
		FileOutputStream fout=new FileOutputStream("Coffee.txt");
		ObjectOutputStream objectwriter =new ObjectOutputStream(fout);
		objectwriter.writeObject(pr);
		objectwriter.flush();
		objectwriter.close();
}
	public Products readProduct1() throws FileNotFoundException,IOException,ClassNotFoundException{
		FileInputStream fin=new FileInputStream("Coffee.txt");
		ObjectInputStream objectreader  = new ObjectInputStream(fin);
		Products pr=(Products) objectreader.readObject();
		return pr;
	}
}
public class ProductApp{
public static void main(String[] args) {
	Products pr=new Products();
	pr.setProductName("Coffee");
	pr.setPrice(200);
	pr.setquantity(2);
	Product1 records = new Product1();
try {
	records.saveProduct1(pr);
	Products record=records.readProduct1();
	System.out.println(record.getProductName());
	System.out.println(record.getPrice());
	System.out.println(record.getquantity());
}
catch(FileNotFoundException e) {
}
catch(IOException e) {
}
catch(ClassNotFoundException e) {
}
}
}

