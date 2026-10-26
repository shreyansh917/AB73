package practice;

public class Assignment18 // "Write a Java program to validate a user login system using nested if-else statements.If the username is correct Then check the password If password is correct - print ""Login successful"" Else - print ""Incorrect password"" Else - print ""Invalid username"""
{
	public static void main(String[] args) 
	{
		String username = "admin";
		String password = "Test123";
		
		if(username == "admin")
		{
			System.out.println("the username is correct");
			if(password == "Test123")
			{
				System.out.println("the password is correct");
				System.out.println("login successfully");
			}
			else
			{
				System.out.println("the password is incorrect");
			}
		}
		else
		{
			System.out.println("the username is invalid");
		}
	}
}
