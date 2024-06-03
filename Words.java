import java.util.*;
public class Words
{
	public static void main(String[] args)
	{	String s="a good   example";
		System.out.println(reverseWords(s));
	}
	 
	 static String reverseWords(String s) 
	 {
                ArrayList<String> ans=new ArrayList<>();
		 int j=0;
		 
              for(int i=0;i<s.length();)
             {
           	 String temp="";
            	 j=i;
                while(j<s.length()&&s.charAt(j)!=' ')
                {   
                  if(!(s.charAt(j)==' '))
                  temp+=s.charAt(j);
                  j++;
                }
               if(temp!=" "||temp!="")
               ans.add(temp);
               i=j+1;
            }
        
        String S2="";
        Collections.sort(ans);
  	ans.removeIf(item->item.equals(""));
        System.out.println(ans);
        System.out.println(ans.size());
        for(int k=ans.size()-1;k>=0;k--)
        {   if(!ans.isEmpty())
            {
                if(k!=0)
                S2+=(ans.get(k)+" ");
                else
                {
                    S2+=ans.get(0);
                }
            }
        }
        return S2.trim();
    }
}
