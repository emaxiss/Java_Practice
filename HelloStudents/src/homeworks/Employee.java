package homeworks;
public class Employee extends Person
{
	private double salary;
	private String company;
	
	public Employee(String name, double aSalary, String aCompany)
	{
		super(name);
		salary = aSalary;
		company = aCompany;
	}
	
	
}