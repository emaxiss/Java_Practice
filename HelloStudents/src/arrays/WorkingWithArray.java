package arrays;

public class WorkingWithArray
{
	public static void main(String[] args)
	{
		int myArray2[]; //rare
		int [] myArray;
		
		myArray = new int[68];
		for (int i = 0; i < 68; i++)
			myArray[i] = i + 1;
	
		
		String myStrings2[];//rare
		String[] myStrings;
		
		myStrings = new String[2];
		myStrings[0] = new String("Tony");
		myStrings[1] = "Vlad";

		for(int i = 0; i < myStrings.length; i++)
			System.out.println(myStrings[i]);
		
//array initialization
		String[] family = {"mama", "papa"};
		
	}
}
