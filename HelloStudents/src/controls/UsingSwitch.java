package controls;

public class UsingSwitch
{
	public static void main(String[] args)
	{

// 1
		System.out.println("1. Traditional");
		int index = 3;
		
		switch(index)
		{
			case 1:
				System.out.println("1 case");
				break;
			case 2:
				System.out.println("2 case");
				break;
			case 3:
				System.out.println("3 case");
				break;
				default:
					System.out.println("default case");
		}
		
//2 
		System.out.println("2. Enhanced");
		index = 3;
		
		switch(index)
		{
			case 1 -> System.out.println("1 case");
			case 2 -> System.out.println("2 case");
			case 3 -> System.out.println("3 case");
			default -> System.out.println("default");
		}
	}
}
