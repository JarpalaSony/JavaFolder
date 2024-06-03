interface In
{
	int a=10;
	void display();
}
class A implements In
{
	public void display()
	{
		System.out.println("INterfaces in java");
	}
}
public class interface1
{
	public static void main(String[] args)
	{	A a1=new A();
		a1.display();
		System.out.println(In.a);
//		In.a=30;
		System.out.println(A.a);
		
	}
}
