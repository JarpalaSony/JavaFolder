class Shapes
{	String a="10";
	final void area()
	{
		System.out.println("I am in shapes");
	}
}
class Circle extends Shapes
{	String a="20";
	void area()
	{
		System.out.println("I am in circle");
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
		Shapes s1=new Circle();
		System.out.println(s1.a);
		//Shapes 
		s.area();
		
	}
}
