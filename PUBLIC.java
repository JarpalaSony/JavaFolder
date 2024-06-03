import pack.testpublic;
public class PUBLIC
{
	public static void main(String[] args)
	{
		A a=new A();
		System.out.println(a.a);
		testpublic s=new testpublic();
		System.out.println(s.w);
	}
}
class A
{
	int a=10;
}
