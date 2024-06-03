package pack;
public class CLL
{	private Node head;
	private Node tail;
	public int size;
	
	public void insert(int val)
	{	Node n=new Node(val);
		if(head==null)
		{
			head=n;
			tail=head;
			return;
		}
		tail.next=n;
		n.next=head;
		tail=n;
		size++;
	}
	
	public void delete(int val)
	{
		
		Node temp=head;
		Node last=null;
		Node address=null;
		do
		{
			last=temp;
			if(temp.data==val)
			{
				address=temp;
				break;
			}
			temp=temp.next;
		}
		while(temp!=head);
		
		if(address==head)
		{
			Node t=head;
			head=head.next;
			address.next=null;
			tail.next=head;
		}
	}
	public void display()
	{
		Node temp=head;
		do
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		while(temp!=head);
		System.out.println(temp.data);
	}
	private class Node
	{
		int data;
		Node next;
		public Node(int val)
		{
			this.data=val;
		}
		public Node(int data,Node next)
		{
			this.data=data;
			this.next=next;
		}
	}
}
