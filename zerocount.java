public class zerocount
{
	public static void main(String[] args)
	{
		int[] arr={1,2,0,3,0,4,0};
		countzero(arr,7);
	}
	static int countzero(int[] arr,int size)
	{
		static int count=0;
		if(size==0)
		{return count;
		}
		if(arr[size-1]==0)
		{
		count++;
		}
		countzero(arr,size-1);
	}
	
}
