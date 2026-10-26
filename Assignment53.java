package practice;


/* Relationship between Class, Interface and Abstract Class
*
* -------------------------------------------------------------
* | Source          | Target          | Keyword/Relationship  |
* -------------------------------------------------------------
* | Interface       | Interface       | extends              |
* | Abstract Class  | Interface       | implements           |
* | Interface       | Abstract Class  | Not Possible         |
* | Interface       | Class           | Not Possible   
*   class			  Interface			implements
* 
*         RELATIONSHIP BETWEEN CLASSES
 * ============================================================
 *
 * | From / Sub Class    | With / Super Class    | Keyword     |
 * |---------------------|-----------------------|-------------|
 * | Class               | Abstract Class        | extends     |
 * | Abstract Class      | Class                 | extends     |
 * | Abstract Class      | Abstract Class        | extends     |
 * | Class               | Class                 | extends     |
*/



interface A10
{
	void add();
	void sub();
}


abstract class A9 implements A10
{
	public void add()
	{
		System.out.println("this is add method");
	}
	
	void mul()
	{
		
		System.out.println("this is mul method");
	}
	
}


public class Assignment53 extends A9 //WAP to make relationship between abstract class and interface
{
	
	
	public void sub()
	{
		System.out.println("this is sub method");
	}
	
	
	public static void main(String[] args) 
	{
		Assignment53 s2=new Assignment53();
		
		s2.add();
		s2.sub();
		s2.mul();
		
	}
	
	
}
