package exceptions;

public class WithFinally
{
	public int getNumber()
	{
		int i = 25;
		try
		{
			return i;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Inside finally");
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	}
}
