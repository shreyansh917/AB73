package practice;

public class Assignment29 //Write a program to access static and non-static global variables from static and non-static methods. 
{
	
	int a=10;
	
	static int b=20;
	
	
	static void add()
	{
		System.out.println(b);
		
		Assignment29 s1=new Assignment29();
		System.out.println(s1.a);
	}
	
	public void sub()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public static void main(String[] args) 
	{
		add();
		
		Assignment29 b1=new Assignment29();
		
		b1.sub();
		
	}
}
