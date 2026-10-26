package practice;

public class Assignment11 // Write a program on Constructor overloading
{
	Assignment11(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	Assignment11(int a,double b)
	{
		double c=a-b;
		System.out.println(c);
	}
	
	Assignment11(double a,double b)
	{
		double c=a/b;
		System.out.println(c);
	}
	
	
	
	
	public static void main(String[] args) 
	{
		new Assignment11(10,10);
		new Assignment11(20,10.10);
		new Assignment11(5.5,2.2);
		
		
	}
}
