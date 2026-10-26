package practice;

public class Assignment2 // WAP to have 4 static methods and call them inside the main method
{
	static void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	static void sub()
	{
	int a=10;
	int b=20;
	int c=a-b;
	System.out.println(c);
	}

	static void mul()
	{
	int a=10;
	int b=20;
	int c=a*b;
	System.out.println(c);
	}
	
	static void div()
	{
	int a=10;
	int b=20;
	int c=a/b;
	System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		
	}
}
