import java.util.*;
import java.util.stream.*;
public class Remove
{
	public static void main(String[] args)
	{
		int[] nums={1,2,2};
		List<Integer> ds=Arrays.stream(nums).boxed().collect(Collectors.toList());
		System.out.println(ds);
		//subset()
	}
}
