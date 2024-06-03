import java.util.*;
public class WiggleSort
{
	public static void main(String[] args)
	{
		int[] arr={1,3,2,2,3,1};
		Wiggle(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void Wiggle(int[] arr)
	{	
		int n=arr.length;
		int[] min=new int[n/2];
		int[] max=new int[n/2];
	
		Arrays.sort(arr);
		for(int i=0;i<n/2;i++)
		{
			min[i]=arr[i];
			max[i]=arr[n/2+i];
		}
		int k=0;
		for(int i=0;i<n/2;i++)
		{
			arr[k]=min[i];
			k++;
			arr[k]=max[i];
			k++;
		}
	}
	
}
