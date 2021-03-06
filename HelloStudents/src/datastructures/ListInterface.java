package datastructures;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ListInterface
{
	public static void main(String[] args)
	{
		var names = new ArrayList<String>(); // int -> Integer double -> Double
		names.add("Ann");
		names.add("Cindy");
		System.out.println(names);
		
		names.add(1, "Bob");
		System.out.println(names);
		
		names.remove(0);
		names.set(0, "Donald");
		System.out.println(names);
		
		String name1 = names.get(1);
		System.out.println(name1);
		
		int size = names.size();
		
		List<String> family = Arrays.asList("Vlad", "Tony", "Boris", "Sofya");
/*
 * for (int i = 0; i < family.size(); i++)
 * System.out.println(family.get(i));
 */
		
// for each
/*
 * for (String name: family)
 * System.out.println(name);
 */
		
		int[] numbers = {1, 2, 3};
		for (int i: numbers)
			System.out.println(i);
// forEach method
		family.forEach(name -> System.out.println(name));
	}
}