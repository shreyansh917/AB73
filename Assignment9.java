package practice;

public class Assignment9 //WAP to demonstrate non-Static Method Overloading in Java.
{
	
	void add()
	{
		System.out.println("start adding");
	}
	
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	void add(double a,double b)
	{
		double c=a-b;
		System.out.println(c);
	}
	
	void add(double a,int b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	
	
	public static void main(String[] args) 
	{
		Assignment9 f1 = new Assignment9();
		f1.add();
		f1.add(10,10);
		f1.add(20,20.5);
		f1.add(20.5,30.5);
		f1.add(20.6,10);
		
		
	}
}
