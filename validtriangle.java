public class validtriangle
{
	public static void main(String[] args)
	{
		System.out.println(check(3,4,7));
	}
	static boolean check(int a,int b,int c)
	{
		if(a+b<=c||a+c<=b||a+c<=b)
		{
		return false;
		}
		return true;
	}
}
