import java.util.*;
public class SingleNumberIII
{
	public static void main(String[] args)
	{
		int[] nums={1,2,1,3,2,5};
		System.out.println(Arrays.toString(singleNumber(nums)));
	}
	 static int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }
            else
            {
                int p=map.get(nums[i]);
                map.put(nums[i],p+1);
            }
        }
        int[] ans=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])==1)
            {
                ans[k]=nums[i];
                k++;
            }
        }
       for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" "+map.get(nums[i]));
            System.out.println();
        }
        return ans;
    }
}
