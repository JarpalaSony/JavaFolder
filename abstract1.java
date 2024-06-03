abstract class A
{
	int a;
	String name;
	abstract void display();
	public A(int num)
	{
		this.a=num;
	}
	public A(String name)
	{
	this.name=name;
	}
	
}
public class abstract1 extends A
{	//@Override
	public abstract1(int num)
	{
	//super(num);
	super("SOny");
	}
	void display()
	{
		System.out.println("abstract methods");
	}
	public static void main(String[] args)
	{
		abstract1 a1=new abstract1(50);
		//.a=20;
		//a1.a=30;
		System.out.println(a1.a);
		System.out.println(a1.name);
	}
}
