package generics;
import java.util.*;
public class CustomArrayList
{	private int[] data;
	private int DEFAULT_SIZE=10;
	private int size=0;
	
	public CustomArrayList()
	{
		this.data=new int[DEFAULT_SIZE];
	}
	public void add(int val)
	{
		if(this.isFull())
		{
			this.resize();
		}
		data[size++]=val;
	}
	private boolean isFull()
	{
		return size==data.length;
	}
	private void resize()
	{
		int[] temp=new int[data.length*2];
		for(int i=0;i<data.length;i++)
		{
			temp[i]=data[i];
		}
		data=temp;
		
	}
	public int remove(int index)
	{
		int removed=data[--size];
		return removed;
	}
	public int get(int index)
	{
		return data[index];
	}
	public int size()
	{
		return size;
	}
	@Override
	public String toString()
	{
		return "CustomArrayList data={"+Arrays.toString(data)+"}";
	}
	public static void main(String[] args)
	{
		CustomArrayList list=new CustomArrayList();
		for(int i=0;i<12;i++)
		list.add(i*2);
		System.out.println(list);
		System.out.println(list.size());
		
	}
}
