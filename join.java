import java.util.*;
public class join
{
	public static void main(String[] args)
	{
		String s="a   good   example";
		s=s.trim();
		String[] str_arr=s.split("\\s");
		ArrayList<String> str=new ArrayList<>(Arrays.asList(str_arr));
		
		System.out.println(Reverse(str));
		//System.out.println(str_arr);
	}
	static String Reverse(ArrayList<String> s)
	{
		s.removeIf(item->item.equals(""));
		int i=0;
		int j=s.size()-1;
		while(i<=j)
		{
			String temp=s.get(i);
			s.set(i,s.get(j));
			s.set(j,temp);
			i++;
			j--;
		}
		String[] words=new String[s.size()];
		words=s.toArray(words);
		String ans=String.join(" ",words);
		return ans;
	}
}
