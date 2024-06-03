import java.util.*;
public class GroupHash
{
	public static void main(String[] args)
	{	String[] arr={"eat","tea","tan","ate","nat","bat"};
		group(arr);
	}
	static ArrayList<<String>> group(String[] arr)
	{
		HashMap<String,> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{	 
			char[] ch=arr[i].toCharArray();
			Arrays.sort(ch);
		
			String s="";
			for(int j=0;j<ch.length;j++)
			{
				s+=ch[j];
			}
			
			for(int j=0;j<arr.length;j++)
			{
				if(i==j)
				continue;
				
				if(!map.containsKey(s))
				{
					char[] ch1=arr[j].toCharArray();
					Arrays.sort(ch1);
					
					String s2="";
					for(int m=0;m<ch1.length;m++)
					{
						s2+=ch1[m];
					}
					if(s.equals(s2))
					{
					map.put(arr[i]);
					map.put(arr[j]);
					}
				}
			}
			
		}
	}
}
