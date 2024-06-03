import pack.DLL;
public class DLL1
{
	public static void main(String[] args)
	{
		DLL list=new DLL();
		list.insert(1,1);
		list.insert(2,2);
		list.insert(3,4);
		list.insert(3,3);
		list.insert(1,0);
		list.insert(5,2);
		list.insert(7,5);
		list.display();
		
	}
}
