package practice;

import java.util.Arrays;

public class Assignment69 //WAP to find out if the string is anagram?
{
	public static void main(String[] args) 
	{
		String a = "was";
		String b = "saw";
		
		if(a.length() != b.length())
		{
			System.out.println("this is not anagram");
		}
		
		else 
		{
			char[] c1 =a.toCharArray();
			char[] c2 =b.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1, c2))
			{
				System.out.println("This is anagram");
			}else 
			{
				System.out.println("this is not anagram");
			}
		}
	}
}
