public class indirectfact
{
	public static void main(String[] args)
	{
		
		System.out.println(fact(3));
	}
	static int fact(int n)
	{
		int ans=3*fact2(2);
		return ans;
	}
	static int fact2(int n)
	{
		int ans=2*fact1(1);
		return ans;
	}
	static int fact1(int n)
	{
	int ans=1;
	return ans;
	}
}
