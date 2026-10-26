package practice;

public class Assignment60 //WAP to check if the string is a Palindrome?
{
	public static void main(String[] args) 
	{
		String input = "madam";
		String output = "";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1= input.charAt(i);
			output = output+c1;
		}
		
		if(input.equals(output))
		{
			System.out.println("Given string is Palindrome");
		}
		else 
		{
			System.out.println("Given string is not Palindrome");
		}
	}
}
