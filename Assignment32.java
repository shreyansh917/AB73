package practice;

import java.util.Scanner;

public class Assignment32 //  WAP for two number addition using Scanner class
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("add value of a");
		
		int a=s1.nextInt();
		
		System.out.println("add value of b");
		int b=s1.nextInt();
		
		System.out.println("your ans");
		int c=a+b;
		System.out.println(c);
		s1.close();
	}
}
