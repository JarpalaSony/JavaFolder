import pack.LL;
public class LL1
{
	public static void main(String[] args)
	{
		LL l=new LL();
		l.insertFirst(5);
		l.insertFirst(6);
		l.insertFirst(7);
		l.insertFirst(8);
		l.insertFirst(9);
		l.insertEnd(6);
		l.insertEnd(7);
		l.insertIndex(8,0);
		System.out.println(l.deleteIndex(5));
		l.display();
	}
}
