package stackdemo;

class Node {
	int data;
	Node next;
	public Node(int data,Node next)
	{ 
		this.data=data;
		this.next=next;
	}

}

public class StackList {


	Node TOP;

	public StackList() 
	{ 
		TOP=null;
	}
	public void push(int i)
	{ 
		Node n=new Node(i,null);
   n.next=TOP;
		TOP=n;
	}

	public int pop()
	{ 
		 int data=TOP.data;
		 TOP=TOP.next;
		 return data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 StackList stackList=new StackList();
 stackList.push(10);
 stackList.push(23);
 stackList.push(11);
 stackList.push(16);
 System.out.println(stackList.pop());
 System.out.println(stackList.pop());
 System.out.println(stackList.pop());
 System.out.println(stackList.pop());

	}

}
