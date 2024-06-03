import java.util.*;
public class inputarr
{
	public static void main(String[] args)
	{	Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of processes:");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		}
		
	}
}
