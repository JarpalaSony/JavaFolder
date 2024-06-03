import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of processes:");
        int n=sc.nextInt();
        //System.out.println("Enter the number of processes:");
        int[] pid=new int[n];
        int[] ct=new int[n];
        int[] tat=new int[n];
        int[] at=new int[n];
        int[] bt=new int[n];
        boolean[] finished=new boolean[n];
        
        //input arrival times BT times;
        input_ATBT(at,bt,n);
        
        //Sort the processes according to the burst times
        Sort_BT(at,bt,0,n-1);
        System.out.println(Arrays.toString(at));
        System.out.println(Arrays.toString(bt));

    }
    static void input_ATBT(int[] at,int[] bt,int n)
    {
        System.out.println("Enter"+n+" Ats and their corresponding burst times:");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<at.length;i++)
        {    bt[i]=sc.nextInt();
            
            
        }
        for(int i=0;i<bt.length;i++)
        {
            at[i]=sc.nextInt();
        }
        return;
        
    }
    static void Sort_BT(int[] at,int[] bt,int low,int high)
    {
        if(low>=high)    
        {return;
        }
        int s=low;
        int e=high;
        int m=s+(e-s)/2;
        while(s<=e)
        {
            while(bt[s]<bt[m])
            {
                s++;
            }
            while(bt[e]>bt[m])
            {e--;
            }
            if(s<e)
            {
                int temp=bt[s];
                bt[s]=bt[e];
                bt[e]=temp;
                
                int temp2=at[s];
                at[s]=at[e];
                at[e]=temp2;
                s++;
                e--;
            }
        }
        Sort_BT(at,bt,low,e);
        Sort_BT(at,bt,s,high);
    
        
    }
    
}
