package practice;

public class Assignment77 //Write a Java program to demonstrate how StringBuffer can be used for insertion and deletion instead of String.
{
	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer("hello");
		
		s1.insert(5, " java");
		System.out.println(s1);
		
		s1.delete(6, 10);
		System.out.println(s1);
	}
}
