package inter;
public class Lenovo implements Laptop
{
	public void copy()
	{
		System.out.println("copy related code");
	}
	public void paste()
	{
		System.out.println("paste related code");
	}
	public void cut()
	{
		System.out.println("cut related code");
	}
	/*public void keyboard()
	{
		System.out.println("keyboard related code");
	}*/
	public static void main(String[] args)
	{
		Lenovo lenovo=new Lenovo();
		lenovo.copy();
		lenovo.paste();
		Laptop lp=new Lenovo();
		lb.keyboard();
	}
}
