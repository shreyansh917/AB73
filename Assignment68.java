package practice;

public class Assignment68 // WAP to count the number of alphabets present in the given String?
{
	public static void main(String[] args) 
	{
		String str = "Hello123World!@#";
		int count = 0;

		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			if (Character.isAlphabetic(ch)) 
			{
				count++;
			}
		}

		System.out.println("Number of alphabets in the given string: " + count);
		
	}
}
