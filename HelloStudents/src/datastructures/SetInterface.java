package datastructures;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
public class SetInterface
{
	public static void main(String[] args)
	{
		var set = new HashSet<String>();
		set.add("element1");
		set.add("element2");
		set.add("element3");
		set.add("element1");
		
		System.out.println(set);
		
		var fruits = new HashMap<String, String>();
		fruits.put("orange", "orange");
		fruits.put("banana", "yellow");
		fruits.put("grapes", "green");
		
		Set<String> keys = fruits.keySet();
		
		for(String key: keys)
		{
			System.out.println(key);
			System.out.println(fruits.get(key));
		}
		
		int numberOfKeys = keys.size();
				System.out.println(numberOfKeys);
				
		keys.forEach(key -> System.out.println(key));
	}
}