package stackdemo;
class Node9
{
	Bug bug;
	Node9 next;
	public Node9(Bug bug, Node9 next)
	{
		super();
		this.bug = bug;
		this.next = next;
	}
	
}
class Bug
{
int bugno;
String description;
	public Bug(int bugno, String description)
	{
	super();
	this.bugno = bugno;
	this.description = description;
}
	@Override
	public String toString() {
		return "Bug [bugno=" + bugno + ", description=" + description + "]";
	}
	
 
}
public class BugTracking {
Node9 top;
	void push(Bug bug)
	{
	Node9 n=new Node9(bug,null);
		
			n.next=top;
			top=n;
		System.out.println("pushed elements"+bug);
		
	}
	void pop()
	{
		Bug bug=top.bug;
		top=top.next;
		System.out.println("popped"+bug);
	}
	void print()
	{
		Node9 curr;
		for(curr=top;curr!=null;curr=curr.next)
		{
			System.out.println("elements present"+curr.bug);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BugTracking b=new BugTracking();
		b.push(new Bug(10,"login"));
		b.push(new Bug(11,"password"));
		b.push(new Bug(12,"username"));
		b.pop();
		b.pop();
		b.print();
	
	}
 
}