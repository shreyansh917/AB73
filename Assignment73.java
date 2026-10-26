package practice;

import java.util.Arrays;

public class Assignment73 // Write a Java program to perform split(), replace(), replaceAll(), and matches() operations on given strings and print the results.
{
	public static void main(String[] args) 
	{
		String a = "my name is java";
		
		String[] c1=a.split(" ");
		System.out.println(Arrays.toString(c1) );
		
		String b = "hello my name is java";
		System.out.println(b.replace("my", "your"));
		
		String d = "School2536";
		
		System.out.println(d.replaceAll("[0-9]",""));
		
		System.out.println(a.matches("a(.*)"));
	}
}
