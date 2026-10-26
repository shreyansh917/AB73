package practice;

import java.util.Arrays;

public class Assignment71 //Write a Java program to split the string "My name is Vishnu" into 4 parts using split(" ", 4) and print the result.
{
	public static void main(String[] args) 
	{
		String a = "My name is Vishnu";
		
		String [] c1 = a.split(" ", 4);
		
		System.out.println(Arrays.toString(c1));
	}
}
