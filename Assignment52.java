package practice;


class a4
{
	void div()
	{
		System.out.println("this is concreate class div");
	}
	
	// abstract void sub2();  can not add abstract method in concrete class
}

abstract class a3 extends a4
{
	abstract void add();
	abstract void sub();
	
	void mul()
	{
		System.out.println("this is concrete class mul");
	}
}

public class Assignment52 extends a3 //Write a Java program showing the use of an abstract class, abstract method, concrete class, and concrete method.
{
	
	void add()
	{
		System.out.println("this is add method");
	}
	
	void sub()
	{
		System.out.println("this is sub method");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("this is main");
		
		Assignment52 s1 = new Assignment52();
		
		s1.add();
		s1.sub();
		s1.mul();
		s1.div();
		
	}
	
}
