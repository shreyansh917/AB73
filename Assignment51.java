package practice;

class D2
{
	D2()
	{
		System.out.println("this is constructor 6");
	}
	
	D2(String name)
	{
		System.out.println("this is constructor 5");
	}
}

class D1 extends D2
{
	D1(int a)
	{
		super("test");
		System.out.println("this is constructor 4");
	}
	
	D1()
	{
		System.out.println("this is constructor 3");
	}
}

public class Assignment51 extends D1
{
	
	Assignment51()
	{
		super(10);
		System.out.println("this is constructor 2");
	}
	
	Assignment51(int a)
	{
		System.out.println("this is constructor 1");
	}
	
	public static void main(String[] args) 
	{
		new Assignment51();
	}
}
