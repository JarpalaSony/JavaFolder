import java.util.*;
public class RevWord
{
	public static void main(String[] args)
	{	String S="i.like.programming.very.much";
		 ArrayList<String> ans=new ArrayList<>();
		 int j=0;
		 String sol="";
        for(int i=0;i<S.length();)
        {
            String temp="";
            j=i;
            while(j<S.length()&&S.charAt(j)!='.')
            {
                temp+=S.charAt(j);
                j++;
            }
            if(i!=0&&temp!="")
            {
                temp+='.';
            }
            //ans.add(temp);
            sol=temp+sol;
            i=j+1;
        }
    /*    String S2="";
        for(int k=ans.size()-1;k>=0;k--)
        {   if(!ans.isEmpty())
            S2+=ans.get(k);
        }*/
        
        //System.out.println(ans);
        //System.out.println(S2);
        System.out.println(sol);
	}
}
