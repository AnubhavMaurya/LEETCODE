import java.util.Scanner;
class Solution
{


	public static boolean isPrime(char c)
	{
		return (c == '2' || c == '3' || c == '5' || c == '7');
	}


	public static void decrease(StringBuilder s, int i)
	{
		if (s.charAt(i) <= '2')
		{

			s.deleteCharAt(i);
			s.setCharAt(i, '7');
		}
		else if (s.charAt(i) == '3')
			s.setCharAt(i, '2');
		else if (s.charAt(i) <= '5')
			s.setCharAt(i, '3');
		else if (s.charAt(i) <= '7')
			s.setCharAt(i, '5');
		else
			s.setCharAt(i, '7');

		return;
	}

	public static String primeDigits(StringBuilder s)
	{
		for (int i = 0; i < s.length(); i++)
		{
			if (!isPrime(s.charAt(i)))
			{

				while (i >= 0 && s.charAt(i) <= '2')
					i--;
				if (i < 0)
				{
					i = 0;
					decrease(s, i);
				}
				
				
				else
					decrease(s, i);

				
				for (int j = i + 1; j < s.length(); j++)
					s.setCharAt(j, '7');
				break;
			}
		}

		return s.toString();
	}

	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        String s=Integer.toString(n);
		StringBuilder str = new StringBuilder(s);
        System.out.println(primeDigits(str));

		
	}
}
