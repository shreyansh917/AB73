package practice;

import java.util.Arrays;

public class Assignment72 //Write a Java program to use split(), replace(), and replaceAll() methods on given strings and print the results.
{
	public static void main(String[] args) 
	{
		String a= "My name is java";
		
		String[] c1=a.split(" ");
		
		System.out.println(Arrays.toString(c1));
		
		String b = "My name is shreyansh";
		
		String c=b.replace("shreyansh", "Ramesh");
		System.out.println(c);
		
		String t = "My name is Java123";
		System.out.println(t.replaceAll("[0-9]", ""));
		
	}
}
 