public class SkipChar2
{
	public static void main(String[] args)
	{
		System.out.println(Skip("accdddd"));
	}
	static String Skip(String given)
	{
		if(given.isEmpty())
		{
		return "";
		}
		String ans="";
		char ch=given.charAt(0);
		ans=(ch!='a')?ch+Skip(given.substring(1)):""+Skip(given.substring(1));
		return ans;
	}
}
