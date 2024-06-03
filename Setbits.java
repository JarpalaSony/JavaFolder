public class Setbits
{
	public static void main(String[] args)
	{	int n=1;
		int num=110;
		int count=0;
		while(num!=0)
		{
			if((num&n)!=0)
			{
			count++;
			}
			num=num>>1;
		}
		System.out.println(count);
		//approach 2
		int cnt=0;int n1=10;
		while(n1>0)
		{
		cnt++;
		n1=n1&(n1-1);
		}
		System.out.println("The set bits are:"+cnt);
	}
}
