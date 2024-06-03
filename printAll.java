import java.util.*;
public class printAll
{	static int ch=2;
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of digits you want with the combination of 1 and 2:");
		n=sc.nextInt();
		
		int[] ans=new int[n];
		print(ans,0,n);
	}
	static void print(int[] ans,int i,int n)
	{
		if(i==n)
		{
			System.out.println(Arrays.toString(ans));
			return;
		}
		for(int j=ch;j>=1;j--)
		{
			ans[i]=j;
			print(ans,i+1,n);
		}
	}
}
