package homeworks;

public class H4a
{
	public int fact1(int n)
	{
		int fact = 1;
		
		for(int i = 1; i <= n; i++)
			fact *= 1;
		return fact;
	}
	
	public int fact2(int n)
	{
		if (n == 1)
			return 1;
		else
			return (n * fact2(n - 1));
	}
	
	public static void main(String[] args)
	{
		H4a h = new H4a();
		System.out.println("Factorial of 4: " + h.fact1(4));
	}
}