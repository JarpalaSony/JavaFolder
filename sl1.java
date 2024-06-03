class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class sl1
{
	public static void main(String[] args)
	{
		Node p1=new Node(10);
		Node p2=new Node(20);
		Node p3=new Node(30);
		Node p4=new Node(40);
		
		//establishing the connections
		p1.next=p2;
		p2.next=p3;
		p3.next=p4;
		p4.next=null;
		Node head=p1;
		Node temp=head;
		while(temp!=null)
		{
		System.out.println(temp.data);
		temp=temp.next;
		}
		//System.out.println(temp.data);
	}
}
