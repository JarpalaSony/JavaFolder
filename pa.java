import java.util.*;
//import 
public class pa
{
	public static void main(String[] args)
	{
		String s="([)";
		System.out.println(isBalanced(s));
	}
	static boolean isBalanced(String s)
	{
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{	Character ch=s.charAt(i);
			if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
			{
			stack.push(ch);
			}
			else
			{
			stack.pop();
			}
		}
		if(stack.isEmpty())
		{
		return true;
		}
		else
		{
		return false;
		}
	}
}
