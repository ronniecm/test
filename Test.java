public class Test
{
	public static boolean strCopies(String str, String sub, int n)
	{
		if(n == 0)
			return true;

		if(str.equals(""))
			return false;
		
		if(str.substring(0, sub.length()).equals(sub))
			return strCopies(str.substring(1), sub, n-1);

		return strCopies(str.substring(1), sub, n);
	}

	public static void main(String[] args)
	{
		System.out.println(strCopies("iiicatcatiit", "ii", 2));
	}
}
