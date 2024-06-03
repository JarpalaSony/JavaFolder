public class SubSet
{
	public static void main(String[] args)
	{
		sub_set("","abc");
	}
	static void sub_set(String p,String up)
	{
		if(up.isEmpty())
		{
			System.out.println(p);
			return;
		}
		char ch=up.charAt(0);
		
		sub_set(p+ch,up.substring(1));
		sub_set(p,up.substring(1));	
	
		
	}
}
