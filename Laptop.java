package inter;
public interface Laptop
{
	public void copy();
	public void paste();
	public void cut();
	default void keyboard()
	{
		System.out.println("It is keyboard");
	}
}
