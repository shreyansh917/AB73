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
* 	class			  Interface			implements
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

interface s1
{
	abstract void add(); // In interfCE we can have only ABstarct methods	
	void sub(); //3. Just because all the methods will be only abstract , there is no need to write abstract keyword in front of those methods							
}

interface s2 extends s1
{
	void mul();
}

public class Assignment54 implements s2 //WAP to make relationship between interface and interface
{
	public void add()   // All the methods present under interface will be public in nature.							
	{
		System.out.println("this is add method");
	}
	
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
		
	}
}
