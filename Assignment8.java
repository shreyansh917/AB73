package practice;

public class Assignment8 // WAP to demonstrate Static Method Overloading in Java.
{
	
	static void add()
	{
		System.out.println("start adding");
	}
	
	static void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	static void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	static void add(double a,double b)
	{
		double c=a-b;
		System.out.println(c);
	}
	
	static void add(double a,int b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) 
	{
		add();
		add(10,20);
		add(10,20.2);
		add(20.2,302);
		add(10.2,10);
	}
}
