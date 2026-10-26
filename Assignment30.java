package practice;

public class Assignment30 //Write a program where the same variable name is used locally and globally, and access both from the main() method.
{
	
	static int a=30;
	
	public static void main(String[] args) 
	{
		int a=20;
		System.out.println(a);
		System.out.println(Assignment30.a);
	}
}
