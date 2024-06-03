import java.util.*;
public class FreqCount
{
	public static void main(String[] args)
	{
		int N=5;
		int[] a=new int[N];
		int[] arr={3,3,3,3};
		
		for(int i=1;i<=N;i++)
		{	int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==i)
				{
					count++;	
				}
			}
			a[i-1]=count;
		}
		System.out.println(Arrays.toString(a));
	}
}
