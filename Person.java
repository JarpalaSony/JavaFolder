import java.util.*;
public class Person {
  public static void main(String[] args)
  {int[] a={0,20,30,40,50,60,70,80,90,100,110};
    System.out.println(Arrays.toString(ans(a)));
  }
  static int[] ans(int[] a)
  {
    int[] alter=new int[a.length];
    int i=0;int j=a.length-1;
    int k=0;
    while(i<=j)
    {
      alter[k]=a[j];
      k++;
      if(k<alter.length)
      alter[k]=a[i];
      k++;
      i++;
      j--;
    }
  return alter;
    
  }
 
}
