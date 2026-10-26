package practice;

	
class M1 
	{
		M1()
		{
			System.out.println("constructor 3");
		}
		
		M1(int a)
		{
		
			System.out.println("constructor 4");
		}
	}
	
	
class M2 extends M1
	{
		M2()
		{
			super();
			System.out.println("constructor 5");
		}
		
		M2(int a)
		{
			super(10);
			System.out.println("constructor 6");
		}
	}
	

public class Assignment44 extends M2 //Write a program to demonstrate super calling statement using both parameterized and non-parameterized constructors in multilevel inheritance.
{
	
	
	public Assignment44()
	{		
		super();
		System.out.println("constructor 7");
	}
	
	public Assignment44(int a)
	{		
		super(10);
		System.out.println("constructor 8");
	}
	
	
	public static void main(String[] args) 
	{
		new Assignment44();
		
		System.out.println("*****");
		
		new Assignment44(20);
		
	
	}

}
