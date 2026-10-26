package practice;

public class Assignment75 //Write a Java program to demonstrate String immutability using concat().
{
	public static void main(String[] args) 
	{
		String a = "Java";
		
		a.concat("test");
		
		System.out.println(a);

		String b = a.concat(" programing");
		
		System.out.println(a);
		System.out.println(b);
	}
}
