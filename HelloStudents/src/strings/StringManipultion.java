package strings;

public class StringManipultion
{
	public static void main(String[] args)
	{
		String sentence = "I like learning java 14";
		
		int sizeOfSentence = sentence.length();
		for (int i = 0; i < sizeOfSentence; i++) 
		{
			System.out.print(sentence.charAt(sizeOfSentence - 1 - i));
		}
		System.out.println();
	}
}
