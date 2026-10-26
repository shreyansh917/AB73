package practice;

public class Assignment39 //write a program on constructor chaining using this calling statement
{
	Assignment39()
	{
		this(10.55);
		System.out.println("Constructor 1");
	}
	
	Assignment39(double b)
	{
		this("Test");
		System.out.println("Constructor 2");
	}
	
	Assignment39(String a)
	{
		this(60,50);
		System.out.println("Constructor 3");
	}
	
	Assignment39(int a, int b)
	{
		System.out.println("Constructor 4");
	}
	
	Assignment39(int a,double d)
	{
		this();
		System.out.println("Constructor 5");
	}
	
	public static void main(String[] args) 
	{
		
		new Assignment39(10,20.25);
	}
}
