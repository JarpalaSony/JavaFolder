import java.util.*;
public class SingleNumber
{
	public static void main(String[] args)
	{
		 HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
       // int count=0;
       int[] nums={2,2,2,3};
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
                //System.out.println("hrllo");
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])==1)
                {
                    ans=nums[i];
                    break;
                }
        }
        
        /*for(int i=0;i<nums.length;i++)
        {
            System.out.println(map.get(nums[i])+" ");
        }*/
        System.out.println(ans);
	}
}
