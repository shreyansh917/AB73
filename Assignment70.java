package practice;

import java.util.Arrays;

public class Assignment70 //Write a Java program to split the string "My name is Ram" into separate words using split(" ") and print the result.
{
	public static void main(String[] args) 
	{
		String a = "My name is Ram";
		
		String[] c1 = a.split(" ");
		
		System.out.println(Arrays.toString(c1));
	}
}
