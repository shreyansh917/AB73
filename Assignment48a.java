package practice;

public class Assignment48a 
{
	public static void main(String[] args) 
	{
		System.out.println(Assignment48.a);
		System.out.println(Assignment48.b);
		System.out.println(Assignment48.c);
		//System.out.println(Assignment48.d);    // can not called because this is private use in the same class only
		
		Assignment48.add();
		Assignment48.sub();
		Assignment48.mul();
		//Assignment48.div();						// can not called because this is private use in the same class only
	}
}
