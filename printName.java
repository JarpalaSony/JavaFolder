import java.util.*;
public class printName
{
	public static void main(String[] args)
	{
		printName(4,"SONY");
	}
	static void printName(int n,String name)
	{
		if(n<=0)
		{
		return;
		}
		printName(n-1,name);
		System.out.println(n);
	}
}
