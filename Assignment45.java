package practice;



class E2
{
	E2()
	{
		this(10);
		System.out.println("constructor 5");
	}
	
	E2(int a)
	{
		System.out.println("constructor 6");
	}
}


class E1 extends E2
{
	E1()
	{
		this(10);
		System.out.println("constructor 3");
	}
	
	E1(int a)
	{
		super();
		System.out.println("constructor 4");
	}
}


public class Assignment45 extends E1
{
	
	Assignment45()
	{
		super();
		System.out.println("constructor 2");
	}
	
	Assignment45(int a)
	{
		this();
		System.out.println("constructor 1");
	}
	
	
	public static void main(String[] args) 
	{
		new Assignment45(10);
	}
}
