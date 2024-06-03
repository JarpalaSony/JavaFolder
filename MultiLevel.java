class Vehicle
{
	int year;
	String model;
	String make;
	public Vehicle(int year,String model,String make)
	{
		this.year=year;
		this.model=model;
		this.make=make;
	}
}
class Car extends Vehicle
{
	String bodyStyle;
	public Car(int year,String model,String make,String bodyStyle)
	{
		super(year,model,make);
		this.bodyStyle=bodyStyle;
	}
	void getCarinfo()
	{
		
	}
}
class Sportscar extends Car
{
	String purpose;
	public Sportscar(int year,String model,String make,String bodyStyle,String purpose)
	{
		super(year,model,make,bodyStyle);
		this.purpose=purpose;
	}
	void getDetails()
	{
		System.out.println("Year:"+year);
		System.out.println("Model:"+model);
		System.out.println("make:"+make);
		System.out.println("bodyStyle:"+bodyStyle);
		System.out.println("purpose:"+purpose);
	}
}
public class MultiLevel
{
	public static void main(String[] args)
	{
		Sportscar s=new Sportscar(1994,"volvo","tata consultancy","audi style","sports");
		s.getDetails();
	}
}
