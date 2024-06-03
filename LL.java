package pack;
public class LL
{	private Node head;
	private Node tail;
	int size;
	public LL()
	{
	this.size=0;
	}
	public int deleteIndex(int index)
	{
		Node temp=head;
		if(index==0)
		{return deleteFirst();
		}
		if(index==size)
		{return deleteLast();
		}
		for(int i=1;i<index;i++)
		{
			temp=temp.next;
		}
		int value=temp.next.val;
		temp.next=temp.next.next;
		size-=1;
		return value;
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.val+"->");
			temp=temp.next;
		}
		System.out.print("END");
		System.out.println();
		
	}
	public int deleteFirst()
	{
		int val=head.val;
		head=head.next;
		size=size-1;
		return val;
	}
	public int deleteLast()
	{
		if(size<=1)
		{
			return deleteFirst();
		}
		int value=tail.val;
		Node secondLast=get(size-2);
		tail=secondLast;
		tail.next=null;
		return value;
		
		
	}
	public Node get(int pos)
	{	Node node=head;
		for(int i=0;i<pos;i++)
		{
			node=node.next;
		}
		return node;
	}
	public void insertIndex(int val,int index)
	{
		if(index==0)
		{insertFirst(val);
		return;
		}
		if(index==size)
		{insertEnd(val);
		}
		int i=1;
		Node temp=head;
		while(i<index)
		{
			temp=temp.next;
			i++;
		}
		Node n=new Node(val);
		n.next=temp.next;
		temp.next=n;
		size++;
	}
	public void insertEnd(int val)
	{
		Node n2=new Node(val);
		tail.next=n2;
		if(tail!=null)
		{
		tail=n2;
		}
		size++;
		
	}
	public void insertFirst(int val)
	{
		Node n=new Node(val);
		n.next=head;
		head=n;
		
		if(tail==null)
		{
		tail=head;
		}
		
		size++;
	}
	private class Node
	{
		private int val;
		private Node next;
		public Node(int val)
		{
			this.val=val;
		}
		public Node(int val,Node next)
		{
		this.val=val;
		this.next=next;
		}
	}
}
