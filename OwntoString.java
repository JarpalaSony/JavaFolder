public class OwntoString
{	int num;
	public OwntoString(int num)
	{
	this.num=num;
	}
	@Override
	public String toString()
	{
	return "my object is:{"+num+"}";
	}
	public static void main(String[] args)
	{
		OwntoString obj=new OwntoString(23);
		System.out.println(obj);
		
	}
}
