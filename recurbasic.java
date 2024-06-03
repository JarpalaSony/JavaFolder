public class recurbasic
{
	public static void main(String[] args)
	{
		System.out.println(atm("abcdefg"));
	}
	static int atm(String s)
	{
		if(s.isEmpty())
		{
		return 0;
		}
		return 1+atm(s.substring(1));
	}
}
