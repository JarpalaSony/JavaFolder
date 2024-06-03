import java.util.*;
public class onesub
{
	public static void main(String[] args)
	{
		int[] nums={1,2,1};
		ArrayList<Integer> list=new ArrayList<>();
		System.out.print(onesubseq(nums,2,0,0));
	}
	static int onesubseq(int[] nums,int target,int index,int sum)
	{
		if(index==nums.length)
		{
			if(sum==target)
			{
				
				return 1;
			}
			return 0;
		}
		//ans.add(nums[index]);
		sum+=nums[index];
	        int l=onesubseq(nums,target,index+1,sum);
		sum-=nums[index];
		//ans.remove(ans.size()-1);
		int r=onesubseq(nums,target,index+1,sum);
		
		return l+r;
	}
}
