package pack;
public class Vehicle
{
	private String make;
	private String color;
	private int year;
	private String model;
	public int age=19;
	
	public Vehicle(String make,String color,int year,String model)
	{
		this.make=make;
		this.color=color;
		this.year=year;
		this.model=model;
	}
	
	//public method to print Details
	
	public void printDetails()
	{
		System.out.println("manufacturer:"+make);
		System.out.println("color:"+color);
		System.out.println("year:"+year);
		System.out.println("model:"+model);
	}
}
