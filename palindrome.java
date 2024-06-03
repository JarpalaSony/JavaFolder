public class palindrome
{
	public static void main(String[] args)
	{
		String s="sony";
		System.out.println(check(0,s.toLowerCase()));
	}
	static boolean check(int i,String s)
	{
		if(i>=(s.length()-1)/2)
		{
		return true;
		}
		if(s.charAt(i)!=s.charAt(s.length()-i-1))
		{
		return false;
		}
		return check(i+1,s);
	}
}
