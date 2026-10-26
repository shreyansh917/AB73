package practice;


class a
{
	
	a()
	{
		
		System.out.println("constructor 3");
	}
}


public class Assignment46 extends a//What will happen if we inherit the constructor?
{
	
	 Assignment46() 
	{
		
		 System.out.println("constructor 2");	}
	
	
	public static void main(String[] args)
	{
		new Assignment46();  
		
	} 

}
