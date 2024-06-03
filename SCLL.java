class Node
{
	int data;
	Node next;
}



public class SCLL
{
	public static void main(String[] args)
	{
		Node n1=new Node();
		Node n2=new Node();
		Node n3=new Node();
		
		n1.data=1;
		n1.next=n2;
		
		n2.data=2;
		n2.next=n3;
		
		n3.data=3;
		n3.next=n1;
		
		Node head=n1;
		Node temp=head;
		while(temp.next!=head)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print(temp.data+"->end\n");
	}
}
