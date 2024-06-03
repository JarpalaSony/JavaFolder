import java.util.*;
public class Split
{
	public static void main(String[] args)
	{
		String s="   Hello   World   ";
		/*String[] newstr=s.split("\\s").trim();
		int i=0;
		int j=newstr.length-1;
		
		while(i<=j)
		{
			String temp=newstr[i];
			newstr[i]=newstr[j];
			newstr[j]=temp;
			i++;
			j--;
		}
		//System.out.println(sol.trim());
		System.out.println(Arrays.toString(newstr));
		String sol=String.join(" ",newstr);*/
		s=s.trim();
		String[] words = s.split("\\s");
		String res = Reverse(words);
		System.out.println(res);
		

	}
	 static String Reverse(String[] words) {
        int left = 0, right = words.length - 1;
        while (left <= right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left += 1;
            right -= 1;
        }
        String res = String.join(" ", words);
        return res;
    }
}
