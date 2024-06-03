public class recursion
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4};
        int size=4;
        System.out.println(ArraySum(arr,size));
    }
    static int iterativeSum(int[] integers,int size)
    {
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum=sum+integers[i];
        }
        return sum;
    }
    static int ArraySum(int[] arr,int size)
    {   if(size==0)
        {
            return 0;
        }
        int lastnumber=arr[size-1];
        int Allbutsum=iterativeSum(arr,size-1);
        return lastnumber+Allbutsum;


    }
}