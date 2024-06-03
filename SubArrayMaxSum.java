import java.util.*;
public class SubArrayMaxSum
{
	public static void main(String[] args)
	{
		int[] arr={4,20,1,1,1,1};
		int k=2;
		System.out.println(MaxSum(arr,k));
	}
	static int MaxSum(int[] arr,int k)
	{
		int wsum=0;
		int msum=Integer.MIN_VALUE;
		for(int i=0;i<k;i++)
		{
			wsum+=arr[i];
		}
		msum=wsum;
		for(int j=k;j<arr.length;j++)
		{
			wsum=wsum-arr[j-k]+arr[j];
			if(wsum>msum)
			{
				msum=wsum;
			}
		}
		return msum;
	}
}
