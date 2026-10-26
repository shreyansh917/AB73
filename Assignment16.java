package practice;

public class Assignment16  //Write a Program on nested if Else Block_Case
{
	public static void main(String[] args) 
	{
		int a=30;
		int b=40;
		int c=50;
		
		if(a<b) //if true then go to second if condition and false will run parent else
		{
			System.out.println("run program 1");
			if(c<a) // if true then print this and not then print else block of this child
			{
				System.out.println("run program 2");
			}
			else
			{
				System.out.println("run program 3");
			}
		}
		else
		{
			System.out.println("run program 4");
		}
	}
}
