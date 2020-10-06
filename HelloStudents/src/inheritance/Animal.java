package inheritance;

public class Animal
{
	private String type;
	
//constructor
	public Animal(String aType)
	{
		type = aType;
	}

//methods
	public void eat()
	{
		System.out.println("eating...");
	}
// getter
	public String getType()
	{
		return type;
	}
}
	
