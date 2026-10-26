package practice;

public class Assignment27 // How to access the non static global variable of a different class?
{

	int a=10;
	
	public static void main(String[] args) 
	{
		Assignment27 s1= new Assignment27();
		System.out.println(s1.a);
	}
}
