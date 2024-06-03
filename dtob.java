public class dtob
{
	public static void main(String[] args)
	{
		System.out.println(DtoB(233));
	}
	static String DtoB(int num)
	{
			if(num==1)
			{
			return "1";
			}
			String rem=Integer.toString(num%2);
			return DtoB(num/2)+rem;
	}
}
