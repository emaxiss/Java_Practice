package interfaces;

public class Circle implements Drawable
{
	@Override
	public void draw()
	{
		System.out.println("Drawing circle");
	}
	
	public void fillWithRedColor()
	{
		System.out.println("Filling with red color");
	}
}
