package practice;

public class Assignment59 // WAP the program to reverse the String
{
	public static void main(String[] args) 
	{
			String a ="Banglore";
			
			String b="";
			
			for(int i=a.length()-1;i>=0;i--)
			{
				b=b+a.charAt(i);
			}
			
			System.out.println(b);
	}		
}
