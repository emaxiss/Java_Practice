package homeworks;

public class H1b
{
	public void vowels(char ch)
	{
		switch(ch)
		{
			case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
			default -> System.out.println("Consonant");
		}
	}
	public static void main(String[] args)
	{
		H1b h = new H1b();
		char ch = 'a';
		h.vowels(ch);
		
		ch = 'b';
		h.vowels(ch);
	}
}


