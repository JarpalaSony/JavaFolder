import pack.LLMerge;
public class LLmerge1
{
	public static void main(String[] args)
	{
		LLMerge list1=new LLMerge();
		LLMerge list2=new LLMerge();
		
		
		
		list1.insert(1);
		list1.insert(3);
		list1.insert(5);
		list1.display();
		
		list2.insert(1);
		list2.insert(2);
		list2.insert(9);
		list2.insert(14);
		
		LLMerge ans=LLMerge.merge(list1,list2);
		//list2.display();
		ans.display();
	}
}
