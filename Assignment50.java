package practice;

class parent // How we can avoid our methods being overridden?
{
	  final void add()
	{
		System.out.println("this is add method");
	}
}





public class Assignment50 extends parent //How we can avoid our methods being overridden?
{
	
	void add()
	{
		System.out.println("this is child add method");
	}
	
	
	public static void main(String[] args) 
	{
		
		
		Assignment50 s1= new Assignment50();
		s1.add();
	}
}
