package pac;


    class Shapes
{	
	void area()
	{
		System.out.println("I am in shapes");
	}
}
class Circle extends Shapes
{
	void area()
	{
		System.out.println("I am in circle");
	}


	public String toString()
	{
		return "CLass CIrcle";
	}


}
class Triangle extends Shapes
{
	void area()
	{
		System.out.println("I am in triangle");
	}
}
class Square extends Shapes
{
	void area()
	{
		System.out.println("I am in Sqaures");
	}
}
public class polymor
{
	public static void main(String[] args)
	{
		Shapes s=new Square();
		//Shapes 
		s.area();
		Circle c=new Circle();
		System.out.println(c);
		
	}
}

