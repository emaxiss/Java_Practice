package homeworks;

public class H
{
	public static void main(String[] args)
	{
		String name = "Paul McCartney";
		
		char first = name.charAt(0);
		int space = name.indexOf(' ');
		char last = name.charAt(space + 1);
		
		System.out.println(first + "." + last + ".");
	}
}
