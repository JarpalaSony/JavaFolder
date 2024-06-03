import java.util.*;
public class permu
{	static int count=0;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.next();
		print(0,s.toCharArray());
		System.out.println(count);
		
	}
	static void print(int fi,char[] s)
	{
		if(fi==s.length-1)
		{
			System.out.println(s);
			count++;
			return;
		}
		for(int i=fi;i<s.length;i++)
		{
			char temp=s[i];
			s[i]=s[fi];
			s[fi]=temp;
			print(fi+1,s);
			char temp2=s[i];
			s[i]=s[fi];
			s[fi]=temp2;
		}
	}
}
