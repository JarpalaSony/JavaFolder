public class Equal
{
	public static void main(String[] args)
	{
		int[] nums={0,2,1,-6,6,7,9,-1,2,0,1};
		int sum=0;
		for(int i=0;i<nums.length;i++)
		{
		sum+=nums[i];
		}
		int val=sum/3;
		System.out.println(val);
		int sum1=0;
		boolean f1=false;
		for(int i=0;i<nums.length;i++)
		{
			sum1+=nums[i];
			if(sum1==val)
			{
				f1=true;
				break;
			}
		}
		System.out.println(sum1);
		System.out.println(f1);
	}
}
