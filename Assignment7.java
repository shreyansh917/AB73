package practice;

public class Assignment7 // WAP to demonstrate a parameterized constructor, a parameterized  static method, and a parameterized  non-static method.
{
	
	Assignment7 (int a,int b)
	{
		
		System.out.println(a+b);
	}
	
	static void sub(int a,int b)
	{
		
		System.out.println(a-b);
	}
	
	void  mul(int a,int b)
	{
		
		System.out.println(a*b);
	}
	
	public static void main(String[] args) 
	{
		new Assignment7(10,12); // one way
		
		Assignment7 f1 = new Assignment7 (10,22);
		
		f1.mul(10,10);
		
		sub(20,15);
	}
}
