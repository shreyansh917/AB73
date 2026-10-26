package practice;

public class Test12 
{
	public static void main(String[] args) 
	{
		String input= "madam";
		String output ="";
		
		for(int i= input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
					output=output+c1;
		}
		
		if(input.equals(output))
		{
			System.out.println("this is palindrom");
		}
		else
		{
			System.out.println("this is not palindrom");

		}
		
		
	}
}
