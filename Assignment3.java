package practice;

public class Assignment3 //WAP on how to  call any static method inside any other static method inside the same class
{
	
	static void add()
	{
		System.out.println("This is First Method");
	}
	
	static void sub()
	{
		System.out.println("This is Second Method");
		add();
	};
	
	
	public static void main(String[] args) 
	
	{
		sub();
	}

}
