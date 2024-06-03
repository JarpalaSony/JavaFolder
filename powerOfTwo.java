public class powerOfTwo
{
	public static void main(String[] args)
	{
		System.out.println(power2(6));
		System.out.println(Math.pow(2,6));
		
	}
	static int power2(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return 2*power2(n-1);
	}
}
