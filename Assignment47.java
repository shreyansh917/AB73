package practice;


class b
{
	
	b(int a)
	{
		
		System.out.println("constructor 3");
	}
}


public class Assignment47 extends b//What will happen if we inherit the constructor?
{
	
	 Assignment47() 
	{
		super(10);
		 System.out.println("constructor 2");	}
	
	
	public static void main(String[] args)
	{
		new Assignment47();  
		
	} 

}
