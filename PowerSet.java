public class PowerSet
{
	public static void main(String[] args)
	{
		
		powerset("abc");
	}
	static void powerset(String s)
	{	String sub="";
		int n=s.length();
		for(int i=0;i<(1<<(n));i++)
		{	sub="";
			for(int j=0;j<s.length();j++)
			{
				if((i&(1<<j))!=0)
				{
					sub+=s.charAt(j);
				}
				
			}
			System.out.println(sub);
			
			
		}
	}
}
