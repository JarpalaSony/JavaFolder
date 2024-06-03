import java.util.*;
public class per
{
	public static void main(String[] args)
	{
		String string1="ab";
		String string2="";
		print(string1,string2,0);
	}
	static void print(String string1,String string2,int i)
	{
		if(i==string1.length())
		{
			System.out.println(string2);
			return;
		}
		string2+="a";
		print(string1,string2,i+1);
		string2+="b";
		print(string1,string2,i+1);
	}
}
