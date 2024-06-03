class vehicle
{
	int maxspeed=20;
	void sum()
	{
		System.out.println(10+20);
	}

}
class car extends vehicle
{	int maxspeed=30;
	void display()
	{
		System.out.println("The maximum speed is:"+super.maxspeed);
	}
	int sum()
	{
		return 10+20;
	}
	void sum()
	{
	System.out.println(sum());
	}
	sum();
}
class Main
{
	public static void main(String[] args)
	{
		car c=new car();
		c.display();
	}
}
