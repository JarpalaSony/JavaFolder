package pack;
public class LLMerge
{	
	private Node head;
	private Node tail;
	
	public void insert(int val)
	{	Node node=new Node(val);
		if(head==null)
		{
			head=node;
			tail=head;
			return;
		}
		tail.next=node;
		tail=node;
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
	
	public static LLMerge merge(LLMerge first,LLMerge second)
	{
		Node f=first.head;
		Node s=second.head;
		LLMerge ans=new LLMerge();
		while(f!=null&&s!=null)
		{
			if(f.data<s.data)
			{
				ans.insert(f.data);
				f=f.next;
			}
			else
			{
				ans.insert(s.data);
				s=s.next;
			}
		}
		while(f!=null)
		{
			ans.insert(f.data);
			f=f.next;
		}
		while(s!=null)
		{
		ans.insert(s.data);
		s=s.next;
		}
		return ans;
	}
	
	private class Node
	{
		int data;
		Node next;
		
		public Node(int val)
		{
			this.data=val;
		}
	}
}
