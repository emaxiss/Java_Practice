package strings;

public class StringMethods
{
	public static void main(String[] args)
	{
		String palindrome = "Madam Im Adam";
		String name = "Anthony";
		
		System.out.println("Hello, " + name);
		
		char ch = palindrome.charAt(2);
		System.out.println("Char[2] - " + ch);
		
		int pos = palindrome.indexOf('I');
		System.out.println(pos);
		
		int length = palindrome.length();
		System.out.println(length);
		
		String palindrome2 = new String("Madam Im Adam");
		
		if (palindrome == palindrome2)
			System.out.println("==: strings are equal");
		
		if (palindrome.equals(palindrome2))
			System.out.println("equals: strings are equal");
		
		int intVar = 25;
		float floatVar = 6.6f;
		char charVar = 'V';
		String strVar = "Java 14";
		
		System.out.printf("The formatted string: %d %f %c %s\n", intVar, floatVar, charVar, strVar);
		
		String female = palindrome.substring(0, 5);
		System.out.println(female);
		
		char[] school = {'P', 'a', 's', 'v'};
		String pasv = new String(school);
		System.out.println(pasv);
	}
}
