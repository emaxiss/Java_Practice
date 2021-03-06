package arrays;

import java.util.Arrays;

public class WorkingWithArrays
{
	public static void main(String[] args)
	{
		int myArray2[]; //rare
		int[] myArray;
		
		myArray = new int[68];
		for (int i = 0; i < 68; i++)
			myArray[i] = i + 1;
		
		String myStrings2[]; //rare
		String[] myStrings;
		
		myStrings = new String[2];
		myStrings[0] = new String("Tony");
		myStrings[1] = "Vlad"; //the same as new String("Vlad")
		
		for (int i = 0; i < myStrings.length; i++)
			System.out.println(myStrings[i]);
		
// array initialization
		String[] family = {"mama", "papa"};
		
		int[] numbers = {1, 2, 5};
		for (int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);
		
		System.out.println(Arrays.toString(numbers));
	}
}
