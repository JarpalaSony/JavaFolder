import java.util.*;
public class SkipChar
{
	public static void main(String[] args)
	{
		System.out.println(Skip("baccdah"));
	}
	static String Skip(String given)
	{
		if(given.isEmpty())
		{
			return "";
		}
		if(given.charAt(0)!='a')
		{
			return given.charAt(0)+Skip(given.substring(1));
		}
		return Skip(given.substring(1));
		
	}
}
//if you want to skip the given word 
//just add the condition
/*if(given.startsWith("apple"))
{
return Skip(given.substring(5));
}
else
{
return given.charAt(0)+SKip(given.substring(5));
}
*/

