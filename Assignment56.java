package practice;

interface T1
{
	void sub(); //3. Just because all the methods will be only abstract , there is no need to write abstract keyword in front of those methods							
}

interface T2 extends T1
{
	void mul();
}




public class Assignment56 //WAP to create two interfaces with one method each and implement both interfaces in a single class.
{
	
	
	public void sub()   						
	{
		System.out.println("this is sub method");
	}
	
	public void mul()   						
	{
		System.out.println("this is mul method");
	}
	
	public static void main(String[] args) 
	{
		Assignment56 s1= new Assignment56();
		s1.sub();
		s1.mul();
	}
}
