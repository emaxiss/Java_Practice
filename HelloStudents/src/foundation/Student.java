package foundation;

public class Student
{
	private String name;
	private String gender;
	
	public void eat() 
	{
		System.out.println("I am eating eel");
	}

//default constructor
	
//geters & setters
	public Student() 
	{
		name = "Adam";
		gender = "male";
		
	}
	
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}
	

}
