package practice;

public class Assignment10 //Write a Java program to demonstrate method overloading using two static methods and two non-static methods within a single class.
{
	

	
	void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	void add(int a, double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	
	static void add(double a,int b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	static void add(double a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) 
	{
		
		Assignment10 f1 = new Assignment10 ();
		f1.add(10, 20);
		f1.add(10, 20.5);
		
		add(10.5,20);
		add(10.5,20.5);
	}
	

}
