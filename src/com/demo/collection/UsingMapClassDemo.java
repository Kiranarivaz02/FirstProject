package com.demo.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class UsingMapClassDemo {
	
	
public static  void  main(String a[]) 
{
	
// Creating a Map
	
//Map map=new TreeMap();

//or
TreeMap<Integer,String> tree=new TreeMap<>();

// lets add elements to the map
tree.put(101, "Jennifier");
tree.put(104, "Swathi");
tree.put(102, "SriNidhi");
tree.put(101, "Shruthi");
System.out.println(tree);

// Lets iterate over the map


// Step 1 : Lets first get the copy of this map


/*Set s=tree.entrySet();

System.out.println(" Inside the Set View:"+s);

Iterator it=s.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
*/

Set<Map.Entry<Integer, String>> s = tree.entrySet();

for(Map.Entry<Integer,String> mentry:s)
{
	System.out.println(mentry.getKey()  +" "+mentry.getValue());
	
}


}
}
