import java.util.*;
public class isDigit
{
	public static void main(String[] args)
	{
		String s="1bc1";
		ArrayList<String> ans=new ArrayList<>();
		String a="";
		String b="";
		for(int i=0;i<s.length();i++)
		{	if(i!=0)
			a=(s.substring(0,i)+Character.toUpperCase(s.charAt(i))+s.substring(i));
			if(!(ans.contains(a))&&!(a==""))
			 ans.add(a);
			if(i!=0) 
	              b=(s.substring(0,i)+Character.toLowerCase(s.charAt(i))+s.substring(i));
	              if(!ans.contains(b)&&!(b==""))
	              ans.add(b);
			
		}
		System.out.println(ans);
		
		
		
	
	}
}
