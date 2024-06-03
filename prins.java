import java.util.*;
public class prins
{
	public static void main(String[] args)
	{	int target=2;
		int[] nums={1,2,1};
		ArrayList<Integer> list=new ArrayList<>();
		printS(target,nums,list,0,0);	
	}
	static void printS(int target,int[] nums,ArrayList<Integer> s,int index,int sum)
	{
		if(index==nums.length)
		{
			if(sum==target)
			{
				System.out.println(s);
			}
			return;
		}
		sum+=nums[index];
		s.add(nums[index]);
		printS(target,nums,s,index+1,sum);
		s.remove(s.size()-1);
		sum-=nums[index];
		printS(target,nums,s,index+1,sum);
		return;
		
	}
}
