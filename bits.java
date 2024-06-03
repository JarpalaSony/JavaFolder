import java.util.*;

public class bits
{
	public static void main(String[] args)
	{
		int b=5;
		int c=(int)(Math.floor(Math.log(b)/Math.log(2))+1);
		int mask=0;
		for(int i=0;i<c;i++)
		{
			if((b&(1<<i))!=0)
			{mask=(b&(1<<i));
				break;
			}
		}
		System.out.println(mask);
	}
}
