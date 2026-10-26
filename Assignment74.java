package practice;

public class Assignment74 //Write a Java program to create Strings using String literals and the new keyword, and compare them using == and equals().
{
	public static void main(String[] args) 
	{
		String a = "Hello";
		
		String b = "Hello";
		
		System.out.println(a==b);
		
		String a1 = new String("Hello");
		String b1 = new String("Hello");
		
		System.out.println(a1==b1);
		System.out.println(a==b1);
		
	}
}
