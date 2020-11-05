package homeworks;

import java.util.HashSet;

public class H11
{
	public static void main(String[] args)
	{
		String[] words = {"One", "Two", "One", "Eleven", "Eight", "Eight"};
		
//1a
		var set = new HashSet<String>();
		for (String word: words)
			set.add(word);
		
		if (set.size() == words.length)
			System.out.println("There are no duplicates");
		else
			System.out.println("There are duplicates in array");
		
//1b
		for (String word: words)
			if (!set.add(word))
			{
				System.out.println("There are duplicates in array");
				break;
			}
	}
}
