public class CodeBus
{	private int i=1;
	public static void main(String[] args)
	{
		int i=2;
		CodeBus c=new CodeBus();
		c.someMethod();
	}
	public static void SomeMethod()
	{
		System.out.println(i);
	}
}
