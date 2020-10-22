package homeworks;

public class H8
{
	public static void main(String[] args)
	{
		int[] numbers = {-1, 1, 1, 1, 22, 0};
		
		int min = numbers[0];
		int second = min;
		
		for (int i = 0; i < numbers.length; i++)
			if (numbers[i] < min)
			{
				min = numbers[i];
				second = min;
			}
			else 
				if (numbers[i] < second)
					second = numbers[i];
		
		System.out.println("Second smallest number: " + second);
	}
}
