package practice;

public class Assignment23 // Write a program on global variable and local variable
{
	
	int a =100; //  Global variable or instance Variable
	static int b=200; // Global variable
	
	
	static void add()
	{
		int c=10; // Local Variable
		double d=20.25; // Local Variable
		
		System.out.println(c*d);
	} 
	
	
	public static void main(String[] args) 
	{
		System.out.println(b); 
		
		Assignment23 s1= new Assignment23 ();
		System.out.println(s1.a);
		
		
		add();
	}
}
