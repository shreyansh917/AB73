package practice;

public class Assignment38 //WAP on this keyword
{
	String name;
	int rollno;
	double salary;
	
	void details(String name, int rollno, double salary)
	{
		this.name = name;   // assigning local variable value to global variable
		this.rollno=rollno;
		this.salary=salary;
	}
	public static void main(String[] args) 
	{
		Assignment38 ts=new Assignment38 ();
		ts.details("raj", 100, 20.22);
		System.out.println(ts.name);   //default value of global variable null
		System.out.println(ts.rollno); //default value of global variable 0
		System.out.println(ts.salary); //default value of global variable 0.0
		
		
	}
	
}
