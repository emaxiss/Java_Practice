package inheritance;

public class Dog extends Animal
{
	private String name;
	private String breed;
	
//constructor
	public Dog(String aType, String aName, String aBreed)
	{
		super(aType);
		name = aName;
		breed = aBreed;
	}
	
//methods
	public void bark()
	{
		System.out.println("barking....");
	}

	public void eat()
	{
		System.out.println("eating bones....");
	}
	
	public String getName()
	{
		return name;
	}

	public String getBreed()
	{
		return breed;
	}
}
