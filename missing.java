public class missing
{
	public static void main(String[] args)
	{
		int[] nums={1,2,3,4};
		int N=5;
		int XOR1=0;
		int XOR2=0;
		for(int i=0;i<nums.length;i++)
		{
			XOR1=XOR1^(nums[i]);
			XOR2=XOR2^(i+1);
		}
		XOR2=XOR2^N;
		
		System.out.println(XOR1^XOR2);
	}
}
