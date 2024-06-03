import java.util.*;
public class Group
{
	public static void main(String[] args)
	{	String[] strs={"eat","tea","tan","ate","nat","bat"};
		List<List<String>> a=GA(strs);
		for(List<String> ans:a)
		{
			
			System.out.println(a);
		}
	//	System.out.println(a.get(0));
	//	System.out.println(a.get(1));
		
	}
	static List<List<String>> GA(String[] strs)
	{
		List<List<String>> ans=new ArrayList<>();
		//boolean[] arr=new boolean[strs.length];
		
		HashMap<String,ArrayList<String>> map=new HashMa
		
		for(int i=0;i<strs.length;i++)
		{
		    char[] c1=strs[i].toCharArray();
		    List<String> inner=new ArrayList<>();
		    boolean flag=false;
		    int count=0;
		    for(int j=0;j<strs.length;j++)
		    {   
		   
		        if(i==j)
		        continue;
		        char[] c2=strs[j].toCharArray();
		        Arrays.sort(c1);
		        Arrays.sort(c2);
		        if(Arrays.equals(c1,c2))
		        {
		            inner.add(strs[i]);
		          
		            inner.add(strs[j]);
		   
		            
		        }
		        else
		        {
		        count++;
		        }
		        
		     
		        
		    }
		    	Collections.sort(inner);
		    	
		    /*	if(count==strs.length-1)
		    	{
		    	if(!ans.contains(inner))
		    	inner.add(strs[i]);
		    	}*/
		    	
		      if(!ans.contains(inner))
		      ans.add(inner);
		     
		      
		  
		}
		return ans;
        }
        
}
