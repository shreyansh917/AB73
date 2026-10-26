package practice;


interface a7
{
	void add();  //Just because all the methods will be only abstract , there is no need to write abstract keyword in front of those methods
	void sub();
}



public class Assignment55 implements a7 //WAP to create one interface with two abstract methods and implement the interface in a single class.
{
	
	public void add()
	{
		System.out.println("this is add");
	}
	
	public void sub()
	{
		System.out.println("this is sub");
	}
	
	public static void main(String[] args) 
	{
		Assignment55 s1 = new Assignment55();
				
		s1.add();
		s1.sub();
	}
}
