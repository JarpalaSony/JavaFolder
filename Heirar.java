class parent1
{
	int l;
	int b;
	int d1;
	float boxWeight;
	public parent1(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public parent1(int d1)
	{
		this.d1=d1;
	}
	public parent1(float boxWeight)
	{
		this.boxWeight=boxWeight;
	}
	
	
}
class child1 extends parent1
{	int h;
	public child1(int l,int b,int h)
	{
		super(l,b);
		this.h=h;
	}
	void area()
	{
		System.out.println("length="+l);
		System.out.println("breath="+b);
		System.out.println("area="+(l*b));
		System.out.println("the heigth is:"+h);
	}
}
class child2 extends parent1
{	int d2;
	float area;
	public child2(int d1,int d2)
	{
		super(d1);
		this.d2=d2;
	}
	float arear()
	{	area=(d1*d2)/2;
		return area;
	}
}
class child3 extends parent1
{
	String boxColor;
	public child3(float boxWeight,String boxColor)	
	{
		super(boxWeight);
		this.boxColor=boxColor;
	}
	void getBoxDetails()
	{
		System.out.println("Box weight:"+boxWeight);
		System.out.println("BOx color:"+boxColor);
	}
}



public class Heirar
{
	public static void main(String[] args)
	{
		child1 c=new child1(12,12,1);
		child2 c2=new child2(10,8);
		//System.out.println("area of rhombous is:"+c2.arear());
		//c.area();
		child3 c3=new child3(40.2f,"black");
		c3.getBoxDetails();
		
	}
}
