package inheritance;

public class Dog extends Animal //subclass
{
	private String name;
	private String breed;
	
// constructor
	public Dog(String aType, String aName, String aBreed)
	{
		super(aType); //constructor of the superclass - Animal
		name = aName;
		breed = aBreed;	
	}
	
// methods
	public void bark()
	{
		System.out.println("barking...");
	}

// method overriding
	public void eat()
	{
		System.out.println("eating bones...");
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
