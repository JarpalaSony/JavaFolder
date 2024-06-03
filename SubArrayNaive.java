import java.util.*;
public class SubArrayNaive
{
	public static void main(String[] args)
	{
		int[] arr={5,9,3,2,6};
		int sum=(int)Double.NEGATIVE_INFINITY;
		int k=3;
		int n=arr.length;
		for(int i=0;i<=n-k;i++)
		{
			int sub_sum=0;
			for(int j=i;j<i+k;j++)
			{
				sub_sum+=arr[j];
			}
			if(sub_sum>sum)
			{
				sum=sub_sum;
			}
		}
		System.out.println(sum);
	}
}
