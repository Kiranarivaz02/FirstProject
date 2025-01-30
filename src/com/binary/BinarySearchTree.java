package com.binary;
class Node {
    int data;
    Node left;
    Node right;
 
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
 
    @Override
    public String toString() {
        return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
    }
}
 
public class BinarySearchTree {
    Node root;
 
    public BinarySearchTree() {
        root = null;
    }
    public void addNodeWithoutRecursion(int data)
    {
    	if(root==null)
    	{
    		root= new Node(data);
      return;	
    	}
    	Node current=root;
    	Node parent=null;
    	while(true)
    	{
    		parent=current;
    		if(data<current.data)
    		{
    			current=current.left;
    			if(current==null)
    			{
    				parent.left=new Node(data);
    				return;
    			}
    		}else
    		{
    			if(data>current.data)
    			{
    				current=current.right;
    				if(current==null)
    				{
    				  parent.right=new Node(data);
    				  return;
    				}
    			}
    		}
    	}
    }
 
    public Node addNode(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
 
        if (data < current.data) {
            current.left = addNode(current.left, data);
        } else if (data > current.data) {
            current.right = addNode(current.right, data);
        }
        return current; // return the unchanged node pointer
    }
 
    public void inOrderTraversal(Node n) {
        if (n != null) {
            inOrderTraversal(n.left);
            System.out.println(n.data);
            inOrderTraversal(n.right);
        }
    }
    public void preOrder(Node n) {
    	if(n==null)
    		{
    			return;
    		}
    		else {
    			System.out.println(n.data);
        		postOrder(n.left);
        		postOrder(n.right);
    			
    		}
    	}
    public void postOrder(Node n) {
    	if(n==null) {
    		return;
    	}
    	else {
    		postOrder(n.left);
    		System.out.println(n.data);
    		postOrder(n.right);
    	}
    }
 
    public static void main(String[] args) {
        BinarySearchTree bs = new BinarySearchTree();
//        bs.root = bs.addNode(bs.root, 10);
//        bs.addNode(bs.root, 15);
//        bs.addNode(bs.root, 23);
//        bs.addNode(bs.root, 11);
//        bs.addNode(bs.root, 16);
        bs.addNodeWithoutRecursion(10);
        bs.addNodeWithoutRecursion(12);
        bs.addNodeWithoutRecursion(23);
        bs.addNodeWithoutRecursion(16);
        bs.addNodeWithoutRecursion(15);
        System.out.println("In-Order Traversal:");
        bs.inOrderTraversal(bs.root);
        System.out.println("*************************");
        bs.preOrder(bs.root);
        bs.postOrder(bs.root);
    }
}