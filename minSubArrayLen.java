public class minSubArrayLen
{
	public static void main(String[] args)
	{
		int[] arr={2,3,1,2,4,3};
		int target=7;
		System.out.println(subarray(7,arr));
	}
	static int subarray(int target,int[] nums)
	{
		int min_sub=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int sum=0;
        while(j<nums.length)
        {
            while(i<=j&&sum>target)
            {   if(i>=0)
                sum-=nums[i];
                i--;
            }
            sum+=nums[j];
            if(sum>=target)
            {
                min_sub=Math.min(min_sub,j-i+1);
            }
            j++;
        }
       return min_sub; 
	}
}
