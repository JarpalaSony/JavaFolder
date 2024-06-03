class Node
{
	int val;
	Node next;
}
public class InsertIndex
{
	public static void main(String[] args)
	{
		Node n0=new Node();
		Node n1=new Node();
		Node n2=new Node();
		Node n3=new Node();
		Node n4=new Node();
		Node n5=new Node();
		
		
		n0.val=1;
		n0.next=n1;
		
		n1.val=2;
		n1.next=n2;
		
		n2.val=3;
		n2.next=n3;
		
		n3.val=4;
		n3.next=n4;
		
		n4.val=6;
		n4.next=n5;
		
		n5.val=7;
		
		
		
		int pos=4;
		Node head=n0;
		Node temp1=head;
		int i=0;
		while(i<pos-1)
		{
			temp1=temp1.next;
			i++;
		}
		
		Node n6=new Node();
		n6.val=5;
		
		n6.next=temp1.next;
		temp1.next=n6;
		
		Node temp2=head;
		while(temp2!=null)
		{
		System.out.print(temp2.val+"->");
		temp2=temp2.next;
		}
		System.out.print("END");
		System.out.println();
	}
}
