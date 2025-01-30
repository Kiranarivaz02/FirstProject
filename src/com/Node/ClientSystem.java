package com.Node;

class Node3{
	String machinename;
	int ipAdd;
	Node3 pre;
	Node3 next;
	
Node3(String machinename, int ipAdd, Node3 pre, Node3 next){
	this.machinename=machinename;
	this.ipAdd=ipAdd;
	this.pre=pre;
	this.next=next;
}
}
public class ClientSystem{
Node3 START;
Node3 LAST;
	
	public ClientSystem() {
		START=null;
		LAST=null;
}
	public void add(String machinename, int ipAdd) {
		Node3 n = new Node3(machinename,ipAdd,null,null);
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
		Node3 curr;
		for(curr=START;curr!=null;curr=curr.next) {
			System.out.println(curr.machinename+" "+ curr.ipAdd);
			
		}
	}
	
	public void reverse() {
		Node3 curr;
		System.out.println("Reversed Doubly linked list is:");
		for(curr=LAST;curr!=null;curr=curr.pre) {
			System.out.println(curr.machinename+" "+curr.ipAdd);
		}
	}
	
 
	
	public static void main(String[] args) {
		ClientSystem link= new ClientSystem();
		
		link.add("aaaa",1);
		link.add("bbbbb",2);
		link.add("ccccc",3);
		link.add("ddddd",4);
		link.add("eeee",5);
		link.traverse();
		link.reverse();
		
		
		
	}
 
}
 