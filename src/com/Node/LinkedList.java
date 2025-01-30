package com.Node;

 
public class LinkedList
{
	Node START;
	
	public LinkedList()
	{
		START=null;
	}
	public void add(int data)
	{
		Node n=new Node(data,null);
		if(START==null)
		{
			n.next=START;
			START =n;
			return;
		}
		Node curr;
		for(curr=START;curr.next!=null;curr=curr.next) {
			
		}
		curr.next=n;
	}
	public void traverse() {
		Node curr;
		for(curr=START;curr!=null;curr=curr.next)
		{
			System.out.println(curr.data);
		}
	}
	public static void main(String args[])
	{
		LinkedList link=new LinkedList();
		link.add(11);
		link.add(41);
		link.add(3);
		link.add(64);
		link.add(4);
		link.add(6);
		link.traverse();
	}
}
 
