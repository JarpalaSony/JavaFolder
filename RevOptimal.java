import java.util.*;
public class RevOptimal
{
	public static void main(String[] args)
	{	String s="a good   example";
		String s2=s.substring(0,1);
		System.out.println(s2.charAt(0));
		System.out.println(Rev(s));
	}
	static String Rev(String s)
	{
		String sol="";
		int N=s.length();
		int i=0;
		int j=0;
		while(i<N)
		{
			while(i<N&&s.charAt(i)==' ')
			{
			i++;
			}
			j=i+1;
			while(j<N&&s.charAt(j)!=' ')
			{
			j++;
			}
			if(!(i>j))
			sol=s.substring(i,j)+" "+sol;
			i=j+1;

		}
		return sol;
	}
}
