public class Bits1
{
	public static void main(String[] args)
	{
		System.out.println(Count(Integer(11111111111111111111111111111101)));
	}
	static int Count(int n)
	{
		int cnt=0;
        String num=String.valueOf(n);
        int i=0;
        while(i<num.length())
        {
            if(num.charAt(i)=='1')
            {
                cnt++;
            }
            i++;
        }
        return cnt;
	}
}
