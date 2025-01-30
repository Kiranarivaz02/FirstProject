package treedemo;
class Node9 {
	int data;
	Node9 left;
	Node9 right;
	public Node9(int data, Node9 left, Node9 right) {
		super();
		this.data=data;
		this.left=left;
		this.right=right;
		
	}
}
public class TreeList {
	Node9 root;
	public TreeList()
	{
		root=null;
	}
	public void addLeft(int data) {
		Node9 n = new Node9(data,null,null);
		if(root==null) {
			root=n;
			return;
		}
		Node9 curr;
		for(curr=root;curr.left!=null;curr=curr.left) {
		
		}
		curr.left=n;
	}
	public void addRight(int data) {
		Node9 n = new Node9 (data,null,null);
		if(root==null) {
			root=n;
			return;
		}
		Node9 curr;
		for(curr=root;curr.right!=null;curr=curr.right) {
		
	}
		curr.right=n;
	}
	public void traverse()
	{
		System.out.println("traversing left side");
		for(Node9 curr=root;curr!=null;curr=curr.left)
		{
			System.out.println(curr.data);
		}
		System.out.println("traversing right side");
		
		for(Node9 curr=root;curr!=null;curr=curr.right)
		{
			System.out.println(curr.data);
		}
			
		
	}
 
	public void printLeft(Node9 n) {
		System.out.println(n.left.data);
	}
	public void printRight(Node9 n) {
		System.out.println(n.right.data);
	}
	public static void main(String[] args) {
		
		TreeList obj=new TreeList();
		obj.addLeft(12);
		obj.addRight(16);
		obj.addLeft(5);
		obj.addRight(19);
		obj.addLeft(77);
		obj.addRight(22);
		obj.traverse();
		
		obj.printLeft(obj.root);
		obj.printRight(obj.root);
		obj.printLeft(obj.root.left);
		obj.printRight(obj.root.right);
}
	
	
}
