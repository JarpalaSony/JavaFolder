import pack.Vehicle;
public class Car extends Vehicle
{
	private String bodyStyle;
	int age=18;
	public Car(String make,String color,int year,String model,String bodyStyle)
	{
		super(make,color,year,model);
		this.bodyStyle=bodyStyle;
		
	}
	public void carDetails()
	{
			printDetails();
			System.out.println("Body Style:"+this.bodyStyle);
			System.out.println(super.age);
	}
	public static void main(String[] args)
	{
		Car a=new Car("volvo","white",1994,"Model 13","Audi style");
		/*Vehicle v=a;
		v.printDetails();
		
		System.out.println();
		a.carDetails();
		*/
		Vehicle v=a;
		Car c=(Car)v;
		c.carDetails();
	}
}
/*public class Car
{	
	
	public static void main(String[] args)
	{
		A a=new A("volvo","white",1994,"Model 13","Audi style");
		a.carDetails();
	}
}*/
