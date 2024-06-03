import java.util.*;
public class insert
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		System.out.println("Enter the "+n+"Elements");
		int[] arr=new int[n+1];
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int temp;int i;
		for(i=n-1;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		int target;
		System.out.println("Enter the target element:");
		target=sc.nextInt();
		arr[i+1]=target;
		System.out.println(Arrays.toString(arr));
	}
}
