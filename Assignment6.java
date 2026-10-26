package practice;

public class Assignment6 //WAP to demonstrate a non-parameterized constructor, a non-parameterized static method, and a non-parameterized non-static method.
{
	
	Assignment6 ()
	{
		System.out.println("Non-parameterized constructor");
	}
	
	static void add ()
	{
		System.out.println("Non-parameterized static method");
	}
	
	void sub ()
	{
		System.out.println("Non-parameterized non static method");
	}
	
	public static void main(String[] args) 
	{
		new Assignment6 (); // one way to call constructor
		
		
		Assignment6 f1 = new Assignment6 (); // create object
		
		add(); // static method called directly by its name
		
		f1.sub();
		
	}
}
