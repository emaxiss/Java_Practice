package foundation;

public class TestStudent
{
	public static void main(String[] args)
	{
		Student st1 = new Student();
		st1.eat();
		st1.setName("Vasya");
		System.out.println(st1.getName());
		
		Student st2 = new Student();
		st2.eat();
		
	}
}
