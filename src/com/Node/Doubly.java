package com.Node;

class Node2{
	int data;
	Node2 pre;
	Node2 next;
	
	Node2(int data, Node2 pre, Node2 next){
		this.data = data;
		this.pre = pre;
		this.next=next;
	}
}
public class Doubly {
Node2 START;
Node2 LAST;
	
	public Doubly() {
		START=null;
		LAST=null;
}
	public void add(int data) {
		Node2 n = new Node2(data,null,null);
		if(START==null ) {
			START=n;
			LAST=n;
			
			return;
		}
		LAST.next=n;
		n.pre=LAST;
		LAST=n;
	}
	
	public void traverse() {
		Node2 curr;
		for(curr=START;curr!=null;curr=curr.next) {
			System.out.println(curr.data);
		}
	}
	
 
	
	public static void main(String[] args) {
		Doubly link= new Doubly();
		
		link.add(1);
		link.add(2);
		link.add(3);
		link.add(4);
		link.add(5);
		link.traverse();
		
		
		
		
	}
 
}
