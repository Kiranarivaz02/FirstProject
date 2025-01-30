package q;

class Message
{
	String senderName;
	String description;
	
	public Message(String senderName, String description) {
		this.senderName = senderName;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Message senderName=" + senderName + ", description=" + description;
	}
	
	
	
	
}
class MNode
{
	Message message;
	MNode next;
     
	 public MNode(Message message, MNode next) {
		
		this.message = message;
		this.next = next;
	}
}
 
 
public class MessageQueue {
 
	MNode Front;
	MNode Rear;
 
public void MesasageQueue() {
		Front =Rear = null;
	}
 
void acceptMessage(Message message)
{
	MNode n=new MNode(message,null);
	if(Front==null && Rear==null)
	{
		Front=Rear=n;
		return;
	}
	Rear.next=n;
	Rear=n;
}
/*void consumeMessage()
{
	Message message=Front.message;
	Front=Front.next;
	System.out.println(message);
}*/
void viewAllMessages()
{
	MNode curr;
	for(curr=Front;curr!=null;curr=curr.next)
	{
		System.out.println(curr.message);
	}
}
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageQueue obj=new MessageQueue();
		obj.acceptMessage(new Message("Jeni 1","hi"));
		obj.acceptMessage(new Message("Durga 1","hola"));
		obj.acceptMessage(new Message("sri 1","hola"));
		obj.acceptMessage(new Message("Navika 1","hola"));
		obj.viewAllMessages();
		
 
	}
 
}
