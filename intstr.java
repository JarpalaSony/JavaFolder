import java.util.*;
public class intstr
{
	public static void main(String[] args)
	{
		int[] digits={9};
		ArrayList<Integer> ans=new ArrayList<>();
		int sum=0;
		int rem=0;
        if(digits.length==1)
        {
            sum=digits[0]+1;
            rem=sum%10;
            sum=sum/10;
            ans.add(rem);
            ans.add(sum%10);
            System.out.println(ans);
            Collections.reverse(ans);
        }
        
		
		//System.out.println(s);
	}
}
