package pack;
class Reverse
{
	public void reverse(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
		rev+=s.charAt(i);
		}
		System.out.println(rev);
	}
}
