package pack;
public class DeleteDLL
{
	private Node head;
	private Node tail;
	public int size;
	public DeleteDLL()
	{this.size=0;
	}
	
	
	public void insertStart(int val)
	{	Node n=new Node(val);
		if(head==null)
		{
			head=n;
			tail=head;
		}
		else
		{
			n.next=head;
			head.prev=n;
			head=n;
		}
		size++;
	}
	
	public void DeleteFirst()
	{
		Node temp=head.next;
		head.next.prev=null;
		head.next=null;
		head=temp;
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("END");
	}
	
	private class Node
	{
		int data;
		Node next;
		Node prev;
		
		public Node(int val)
		{
		this.data=val;
		}
		public Node(int val,Node next,Node prev)
		{
			this.data=val;
			this.next=next;
			this.prev=prev;
		}
	}
}
