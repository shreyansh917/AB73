package practice;

public class Assignment41Child extends Assignment41Parent //"write a program for multilevel inheritance using a static and non static method in the different class name in the single package explorer(ex:module 2 as package name)"
{

	static void div()
	{
		System.out.println("div method");
	}
	
	void mul()
	{
		System.out.println("mul method");
	}
	
	public static void main(String[] args) 
	{
		div(); // calling static method from child class
		mod(); // calling static method from parent class
		add(); // calling static method from grand parent class
		System.out.println(a); // calling static variable from grand parent class
		
		Assignment41Child k1 = new Assignment41Child(); // creating object of child class
		k1.mul(); // calling non static method from child class
		k1.random(); // calling non static method from parent class
		k1.sub(); // calling non static method from grand parent class
		
	}
}
