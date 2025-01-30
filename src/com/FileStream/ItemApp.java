package com.FileStream;
import java.io.*;
//serialization

//serializable instances can be saved to file
class Item implements Serializable
{
	private String itemName;
	private float price;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
 
class ItemRecords{
	public void saveItem(Item item) throws IOException
	{
		FileOutputStream fout=new FileOutputStream("item.txt");
		ObjectOutputStream objectwriter =new ObjectOutputStream(fout);
		objectwriter.writeObject(item);
		objectwriter.flush();
		objectwriter.close();
	}
	public Item readItem() throws FileNotFoundException,IOException,ClassNotFoundException{
		FileInputStream fin=new FileInputStream("item.txt");
		ObjectInputStream objectreader  = new ObjectInputStream(fin);
		Item item=(Item) objectreader.readObject();
		return item;
	}
}
public class ItemApp{
public static void main(String[] args) {
	Item item=new Item();
	item.setItemName("Coffee");
	item.setPrice(200);
	ItemRecords records=new ItemRecords();
try {
	records.saveItem(item);
	Item itemrecord=records.readItem();
	
	System.out.println(itemrecord.getItemName());
	System.out.println(itemrecord.getPrice());
}
catch(FileNotFoundException e) {
}
catch(IOException e) {
}
catch(ClassNotFoundException e) {
}
}
}