import java.util.*;
class desire
{
	public static void main(String[] args)
	{
		int n=135;
		int original=n;
		int len=(int)(Math.log10(n))+1;
		/*
		int count=0;
		while(n!=0)
		{
		count++;
		n=n/10;
		}
		*/
		int sum=0;
		while(n!=0)
		{
			int digit=n%10;
			sum+=Math.pow(digit,len);
			len--;
			n=n/10;
		}
		if(sum==original)
		{
		System.out.println(true);
		}
		else
		{
		System.out.println(false);
		}
		
	}
}
