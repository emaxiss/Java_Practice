package homeworks;

public class TestQAEngineer
{
	public static void main(String[] args)
	{
		var qa = new QAEngineer("John", 90000.00, "Real SQA", 1500.99);
		System.out.println(qa.getName());
		System.out.println(qa.getSalary());
		System.out.println(qa.getCompany());
		System.out.println(qa.getSigninBonus());
		
	}
}
