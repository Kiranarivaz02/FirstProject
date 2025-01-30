package com.Node;

class Node4 {
	String ename;
	Node4 next;
	
	Node4(String ename,Node4 next){
		this.ename=ename;
		this.next=next;
		
	}
}
public class InsertLinked {
	
	Node4 START;
	
	public InsertLinked() {
		START=null;
	}
	public void add(String ename) {
		Node4 n = new Node4(ename, null);
		if(START==null) {
			n.next=START;
			START=n;
			return;
		}
		Node4 curr;
		for(curr=START;curr.next!=null;curr=curr.next) {
			
		}
		curr.next=n;
	}
	public void addAtBegining(String ename) {
		Node4 n = new Node4(ename,null);
		n.next= START;
		START=n;
	}	
	public void addAfter(String value, String ename) {
		Node4 n = new Node4(ename, null);
		Node4 curr;
			
			for(curr=START;curr.ename!=value;curr=curr.next) {
		}
			n.next=curr.next;
			curr.next=n;
	}
	
	public void traverse() {
		Node4 curr;
		for(curr=START;curr!=null;curr=curr.next) {
			System.out.println(curr.ename);
		}
	}
	
 
	
	public static void main(String[] args) {
		InsertLinked link= new InsertLinked();
		
		link.add("Jeni");
		link.add("Sri");
		link.add("Durga");
		link.add("Sri");
		link.add("kiran");
		link.add("navika");
		link.addAtBegining("Anu");
		link.addAfter("kiran","janu");
		link.traverse();
		
		
		
		
	}
 
}