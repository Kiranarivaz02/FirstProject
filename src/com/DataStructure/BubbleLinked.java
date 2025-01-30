package com.DataStructure;
class Node {
	int data;
	Node next;
	
	Node(int data,Node next){
		this.data=data;
		this.next=next;
		
	}
}
public class BubbleLinked {
	Node START;
	public BubbleLinked() {
		START=null;
	}
	public void add(int data) {
		Node n = new Node(data, null);
		if(START==null) {
			n.next=START;
			START=n;
			return;
		}
		Node curr;
		for(curr=START;curr.next!=null;curr=curr.next) {
			
		}
		curr.next=n;
	}
	public void bubbleSort() {
        if (START == null || START.next == null) {
            return;  // No need to sort if the list is empty or has only one element
        }
 
        boolean swapped;
        do {
            swapped = false;
            Node curr = START;
            while (curr != null && curr.next != null) {
                if (curr.data > curr.next.data) {
                    // Swap data between adjacent nodes
                    int temp = curr.data;
                    curr.data = curr.next.data;
                    curr.next.data = temp;
                    swapped = true;
                }
                curr = curr.next;
            }
        } while (swapped);  // Continue until no more swaps are needed
    }
 
	
	public void traverse() {
		Node curr;
		for(curr=START;curr!=null;curr=curr.next) {
			System.out.println(curr.data);
		}
	}
			
 
	
	public static void main(String[] args) {
		BubbleLinked link= new BubbleLinked();
		
		link.add(17);
		link.add(15);
		link.add(14);
		link.add(13);
		link.add(12);
		link.add(11);
		link.traverse();	
		
		 link.bubbleSort();
	        
	        System.out.println("\nSorted list:");
	        link.traverse();  
		
	}
 
}