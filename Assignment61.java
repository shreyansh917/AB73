package practice;

import java.util.Arrays;

public class Assignment61 //"Write a Java program to take the string ""Java Selenium Testing"" and: Convert it into a character array using toCharArray(). Split it into words using split("" ""). Print both arrays using Arrays.toString()."
{
	public static void main(String[] args) 
	{
		String a = "Java Selenium Testing";
		
		char [] c1= a.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		
		
		String [] c2 = a.split(" ");
		System.out.println(Arrays.toString(c2));

		
	}
}
