package practice;

import java.util.Scanner;

public class Assignment34 //"WAP to calculate  area & circumference using scanner class for triangle"

							//Shape 	Area 	Circumference
							//Circle 	pi*r*r 	2*pi*r
							//Triangle 	0.5*b*h a+b+c
							//Square 	a*a 	4*a
							//Rectangle l*b 	2*(l+b)
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter value of b");
		
		double b = sc.nextDouble();
		
		System.out.println("enter value of h");
		
		double h=sc.nextDouble();
		
		System.out.println("enter value of c");
		
		double c=sc.nextDouble();
		
		System.out.println("enter value of a");
		
		double a=sc.nextDouble();
		
		double area = 0.5*b*h;
		
		double circumference = a+b+c;
		
		System.out.println(area);
		
		System.out.println(circumference);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
	}
}
