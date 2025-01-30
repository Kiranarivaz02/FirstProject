package com.binary;
class Employee
{
	String employeeName;
	int rank;
	public Employee(String employeeName,int rank)
	{
		this.employeeName=employeeName;
		this.rank=rank;
	}
	public String toString()
	{
		return employeeName+ " "+rank;
	}
}
class Node1
{
	Employee emp;
	Node1 left;
	Node1 right;
	//private int rank;
	public Node1(Employee emp)
	{
		this.emp=emp;
	}
	public Node1(Employee emp,Node1 left,Node1 right)
	{
		super();
		this.emp=emp;
		this.left=left;
		this.right=right;
	}
}
 
public class BSTPractise {
	Node1 root;
	static Employee emp;
	BSTPractise()
	{
		root=null;
	}
	public void addNode(Employee emp) {
	    if (root == null) {
	        root = new Node1(emp);
	        return;
	    }
 
	    Node1 current = root;
	    Node1 parent = null;
 
	    while (true) {
	        parent = current;
	        if (emp.rank < current.emp.rank) {
	            current = current.left;
	            if (current == null) {
	                parent.left = new Node1(emp);
	                return;
	            }
	        } else if (emp.rank > current.emp.rank) {
	            current = current.right;
	            if (current == null) {
	                parent.right = new Node1(emp);
	                return;
	            }
	        } else {
	            // If data is equal, you can choose to ignore it or handle it as needed
	            return; // Do nothing for duplicates
	        }
	    }
	}
	public void inOrder(Node1 n)
	{
		if(n==null)
		{
			return;
		}
		else
		{
			inOrder(n.left);
			System.out.println(n.emp);
			inOrder(n.right);
		}
	}
	public void preOrder(Node1 n)
	{
		if(n==null)
		{
			return;
		}
		else
		{
			System.out.println(n.emp);
			preOrder(n.left);
			preOrder(n.right);
		}
	}
	public void postOrder(Node1 n)
	{
		if(n==null)
		{
			return;
		}
		else
		{
			postOrder(n.left);
			postOrder(n.right);
			System.out.println(n.emp);
		}
	}
	public Node1 getRoot()
	{
		return root;
	}
	
	public static void main(String args[])
	{
		BSTPractise bst=new BSTPractise();
		Employee e=new Employee("Sandra",5);
		Employee e1=new Employee("Jessica",1);
		Employee e2=new Employee("Cathy",2);
		Employee e3=new Employee("Suzan",3);
		Employee e4=new Employee("Christine",4);
		Employee e5=new Employee("Marry",6);
		Employee e6=new Employee("Cassandra",7);
		Employee e7=new Employee("Sneha",8);
		Employee e8=new Employee("Veniz",9);
		Employee e9=new Employee("Sharmilla",10);
		Employee e10=new Employee("Fenny",11);
		bst.addNode(e);
		bst.addNode(e1);
		bst.addNode(e2);
		bst.addNode(e3);
		bst.addNode(e4);
		bst.addNode(e5);
		bst.addNode(e6);
		bst.addNode(e7);
		bst.addNode(e8);
		bst.addNode(e9);
		bst.addNode(e10);
		System.out.println("root-->"+bst.getRoot().emp.rank);
		System.out.println("left--->"+bst.getRoot().left.emp.rank);
		System.out.println("right------>"+bst.getRoot().right.emp.rank);
		System.out.println("Inorder traversal:");
		bst.inOrder(bst.getRoot());
		System.out.println("PreOrder Traversal:");
		bst.preOrder(bst.getRoot());
		System.out.println("PostOrder Traversal");
		bst.postOrder(bst.getRoot());	
		System.out.println("\nSearching a person using traversal");
		//bst.inOrder(bst.getRoot(),1);
	}
}
 
