package treedemo;

import java.util.*;
public class Tree {

	public static void main(String[] args) {
		//lets create set
		Set tree=new TreeSet();
		tree.add("Z");
		tree.add("h");
		tree.add("X");
		tree.add("L");
		//tree.add(10); runtime exception // homogeneous data
		//tree.add(null); not allowed in tree
		System.out.println(tree); //ascending order
		
		
		
		Set hash=new HashSet(); //load factor:0.75
		hash.add("Z");
		hash.add("H");
		hash.add("X");
		hash.add("L");
		hash.add("L");// duplication removed
		hash.add(10);//heterogeneous data
		hash.add(null);//allowed in hash
		System.out.println(hash); // sorting is based on the internal hashing/ hash code generated


	}

}
