package practice;

public class Assignment40Child extends Assignment40Parent //"write a program for single level inheritance using a static and non static method in the different class name in the single package explorer(ex:module 2 as package name)"
{
	
	static void mul()
	{
		System.out.println("This is a static method from the child class");
	}
	
	
	void div()
	{
		System.out.println("This is a non static method from the child class");
	}
	
	public static void main(String[] args) 
	{
		add(); // calling static method from parent class
		mul(); // calling static method from child class
		
		Assignment40Child k1 = new Assignment40Child(); // creating object of child class
		
		k1.sub(); // calling non static method from parent class
		k1.div(); // calling non static method from child class
	}
}
