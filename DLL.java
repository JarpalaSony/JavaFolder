package pack;
public class DLL
{	private Node head;
	private Node tail;
	public int size;
	Node last=null;
	
	
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			last=temp;
			temp=temp.next;
		}
		System.out.println("END");
		System.out.println(temp);
	}
	
	public void insert(int pos,int val)
	{
		if(pos==1)
		{
		insertHead(val);
		return;
		}
		else if(pos==size+1)
		{
			insertEnd(val);
			return;
		}
		else
		{	Node tmp=head;
			for(int i=1;i<pos-1;i++)
			{
				tmp=tmp.next;
			}
			Node n1=new Node(val);
			n1.prev=tmp;
			n1.next=tmp.next;
			tmp.next.prev=n1;
			tmp.next=n1;
			size++;
			
		}
		
		
	}
	
	public void insertEnd(int val)
	{	Node n=new Node(val);
		if(head==null)
		{
		head=n;
		tail=head;
		}
		else{
		n.prev=tail;
		tail.next=n;
		tail=n;
		
		}
		size++;
		
	}
	
	public void reverse()
	{	Node temp=last;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.prev;
		}
		System.out.println("START");
	}
	
	public void insertHead(int val)
	{
		Node n1=new Node(val);
		if(head==null)
		{
			head=n1;
		}
		else{
		n1.next=head;
		head.prev=n1;
		head=n1;
		}
		if(tail==null)
		{
			tail=head;
		}
		size++;
		return;	
	}
	private class Node
	{
		int data;
		Node prev;
		Node next;
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
