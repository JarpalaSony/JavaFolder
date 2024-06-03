public class case
{
	public static void main(String[] args)
	{
		String p="";
		String up="abc";
		CASE(p,up);
	}
	static void CASE(String p,String up)
	{	
		if(!(p.isEmpty()))
		{System.out.println(p);
		}
		if(up.isEmpty())
		{
		return;
		}
		case((Character.toUpperCase(up.charAt(0))+up.substring(1)),up.substring(1));
		case()
	}
}
