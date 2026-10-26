package practice;

public class Assignment76 //WAP to show that StringBuffer and StringBuilder are Mutable?
{
	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer ("Hello");
		
		s1.insert(5, " java");
		System.out.println(s1);
		
		StringBuilder s2 = new StringBuilder("Java");
		
		s2.append(" World");
		System.out.println(s2);
		
		
	}
}
