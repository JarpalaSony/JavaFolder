class node
{
int val;
node next;
}
public class Node1
{
	public static void main(String[] args)
	{
		node n1=new node();
		node n2=new node();
		node n3=new node();
		node n4=new node();
		n1.val=2;
		n1.next=n2;
		n2.val=3;
		n2.next=n3;
		n3.val=4;
		n3.next=n4;
		n4.val=5;
		n4.next=null;
		node head=n1;
		node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.val);
			temp=temp.next;
		}
		// adding an element at beginning
		System.out.println();
		node n0=new node();
		n0.val=1;
		n0.next=head;
		head=n0;
		node temp1=head;
		while(temp1.next!=null)
		{
			System.out.println(temp1.val);
			temp1=temp1.next;
			
		}
		System.out.println(temp1.val);
		node n5=new node();
		temp1.next=n5;
		n5.val=6;
		
		System.out.println();
		node temp3=head;
		while(temp3!=null)
		{
		System.out.println(temp3.val);
		temp3=temp3.next;
		}
	}
}
