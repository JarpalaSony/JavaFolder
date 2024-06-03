public class SkipAppNotApple
{
	public static void main(String[] args)
	{
		System.out.println(SkipApp("aacdapple"));
	}
	static String SkipApp(String given)
	{
		if(given.isEmpty())
		{
			return "";
		}
		char ch=given.charAt(0);
		if(given.startsWith("app")&&!given.startsWith("apple"))
		{
			return SkipApp(given.substring(3));
		}
		return  given.charAt(0)+SkipApp(given.substring(1));
	}
}
