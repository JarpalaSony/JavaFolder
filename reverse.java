import java.util.*;
public class reverse
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5};
		int mid=(0+(arr.length-1))/2;
		swap(arr,0,mid);
		System.out.println(Arrays.toString(arr));
	}
	static void swap(int[] arr,int i,int mid)
	{
		if(i>mid)
		{
		return;
		}
		int temp=arr[i];
		arr[i]=arr[arr.length-i-1];
		arr[arr.length-i-1]=temp;
		swap(arr,i+1,mid);
	}
}
