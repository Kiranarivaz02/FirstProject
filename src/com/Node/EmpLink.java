package com.Node;
 class Node1 { // to create node
	
	String data;
	Node1 next;
	public Node1(String data, Node1 next)
    {
        this.data = data;
        this.next = next;
    }
}
 
public class EmpLink
{
	Node1 START;
	
	public EmpLink()
	{
		START=null;
	}
	public void add(String data)
	{
		Node1 n=new Node1(data,null);
		if(START==null)
		{
			n.next=START;
			START =n;
			return;
		}
		Node1 curr;
		for(curr=START;curr.next!=null;curr=curr.next) {
			
		}
		curr.next=n;
	}
	public void traverse() {
		Node1 curr;
		for(curr=START;curr!=null;curr=curr.next)
		{
			System.out.println(curr.data);
		}
	}
	public static void main(String args[])
	{
		EmpLink link=new EmpLink();
		link.add("Kiran");
		link.add("Harishma");
		link.add("Erric");
		link.add("Simond");
		link.add("William");
		link.add("Archana");
		link.traverse();
	}
}