import java.util.*;
public class maxSub
{
	public static void main(String[] args)
	{
		int[] max={5,3,3,1,1};
		int k=3;
		System.out.println(maximumSubarraySum(max,k));
	}
	 static long maximumSubarraySum(int[] nums, int k) 
	 {
       	long sum=0;
        	long max=Integer.MIN_VALUE;
        	int i=0;
        	int j=0;
        	HashSet<Integer> set=new HashSet<>();
		for(i=0;i<k;i++)
		{
		    sum+=nums[i];
		    set.add(nums[i]);
		}
       	if(set.size()==k)
       	{
       		max=Math.max(sum,max);
       	}
		i=0;
		j=k;
		while(j<nums.length)
		{
		    sum-=nums[i];
		    if(set.size()==k)
		    set.remove(nums[i]);
		    set.add(nums[j]);
		    sum+=nums[j];
		    if(set.size()==k)
		    {
		        max=Math.max(sum,max);
		    }
		    i++;
		    j++;
		}
        if(max==Integer.MIN_VALUE)
        {
            return 0;
        }
        return max;
    }
 
   
}
