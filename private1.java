/*class A
{
	private int a=30;
	private A()
	{
	System.out.println(a);
	}
}*/
public class private1
{	private private1()
	{
		System.out.println("Private constructor");
	}
	public static void main(String[] args)
	{
		private1 p=new private1();
		A a=new A();
	}
}
class A
{
	A()
	{
		System.out.println("Default class");
	}
}
