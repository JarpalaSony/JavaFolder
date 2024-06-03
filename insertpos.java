import java.util.*;
public class insertpos
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n=sc.nextInt();
		int[] arr=new int[n+1];
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		}
		int pos;
		System.out.println("Enter the position:");
		pos=sc.nextInt();int i;
		for(i=n-1;i>=pos;i--)
		{
		arr[i+1]=arr[i];
		}
		System.out.println("Enter the target element:");
		arr[i+1]=sc.nextInt();
		System.out.println("After insertion:"+Arrays.toString(arr));
		

	}
}
