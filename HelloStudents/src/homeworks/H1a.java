package homeworks;

public class H1a
{
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile)
	{
		/*
		 * if ((aSmile && bSmile) || (!aSmile && !bSmile))
		 * return true;
		 * else
		 * return false;
		 */
		return (aSmile == bSmile);
	}

	public static void main(String[] args)
	{
		H1a h1 = new H1a();
		boolean aSmile = true;
		boolean bSmile = true;
		
		System.out.println("In trouble: " + h1.monkeyTrouble(aSmile, bSmile));
	}
}