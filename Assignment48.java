package practice;

public class Assignment48  //Access Specifier for Methods and Variables
{
	
	public static int a=10;
	
	protected static int b=10;
	
	static int c=10;
	
	private static int d=10;
	
	
	public static void add()
	{
		System.out.println("this is add method");
	}
	
	protected static void sub()
	{
		System.out.println("this is sub method");
	}
	
	static void mul()
	{
		System.out.println("this is nul method");
	}
	
	private static void div()
	{
		System.out.println("this is div method");
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		add();
		sub();
		mul();
		div();
			
		
	}
}
