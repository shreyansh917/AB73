package practice;

import java.util.Scanner;

public class Assignment37 // Develop Calculator logic using scanner class and switch case.
{
	public static void main(String[] args) 
	{
		 

		 Scanner sc =new Scanner(System.in);     
		 
		 
		System.out.println("Enter num 1");
		int num1=sc.nextInt();
		
		System.out.println("Enter num 2");
		int num2 =sc.nextInt();
		
		
		System.out.println("Choose num.");
		System.out.println("1. for addition");
		System.out.println("2. for subtraction");
		System.out.println("3. for multipilication");
		System.out.println("4. division");
		
		
		System.out.println("Choose your no.");
		
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1: System.out.println("Result =" + (num1+num2));
		break;
		
		case 2: System.out.println("Result = " + (num1 - num2));

		break;

		case 3:System.out.println("Result = " + (num1 * num2));

		break;

		case 4:System.out.println("Result = " + (num1 / num2));

		break;
		
		default: System.out.println("Invalid data");
		}
		sc.close();
		
	}
}
