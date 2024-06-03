public class rev
{
public static void main(String[] args)
{
	int num=1534236469;
	int original=num;
	int ans=0;
	if(num<0)
	{
	num=num*(-1);
	}
	while(num>0)
	{
	int rem=num%10;
	ans=rem+ans*10;
	num=num/10;
	}
	if(original<0){
	System.out.println(ans*(-1));}
	else
	{
		System.out.println(ans);
	}
	        int ans=0;
        while(x!=0)
        {
        int rem=x%10;
        ans=rem+ans*10;
            if(ans>Integer.MAX_VALUE||ans==Integer.MAX_VALUE)
            {
                return 0;
            }
            if(ans<Integer.MIN_VALUE||ans==Integer.MIN_VALUE)
            {
                return 0;
            }
        x=x/10;
        }
    
    return ans;
}
}
