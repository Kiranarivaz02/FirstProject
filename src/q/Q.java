package q;

class Node6 {
	int data;
	Node6 next;
	
	Node6(int data,Node6 next){
		this.data=data;
		this.next=next;
	}
}
public class Q {
	Node6 FRONT;
	Node6 REAR;
	public Q()
	{
		FRONT=REAR=null;
		
	}
	public void enqueue(int data) {
		Node6 n =new Node6(data,null);
		if(FRONT==null && REAR==null) {
			FRONT=REAR=n;
			return;
		}
		
	REAR.next=n;
	REAR=n;
}
public void dequeue() {
	int data=FRONT.data;
	FRONT=FRONT.next;
	System.out.println(data);
}
public static void main(String args[]) {
	Q obj=new Q();
	obj.enqueue(12);
	obj.enqueue(22);
	obj.enqueue(54);
	obj.enqueue(33);
	obj.enqueue(10);
	obj.dequeue();
	obj.dequeue();
	obj.dequeue();
	obj.dequeue();
	obj.dequeue();
	
}
	
}
 
 

