package practice;

import java.util.Scanner;

public class Assignment36 // "WAP to calculate  area& circumference using scanner class for rectangle"

						//Shape 	Area 	Circumference
						//Circle 	pi*r*r 	2*pi*r
						//Triangle 	0.5*b*h a+b+c
						//Square 	a*a 	4*a
						//Rectangle l*b 	2*(l+b)
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter value of l");
		
		double l = sc.nextDouble();
		
		System.out.println("enter value of b");
		
		double b = sc.nextDouble();
		
		
		double area = l*b;
		double circumference = 2*(l+b);
		
		System.out.println(area);
		System.out.println(circumference);
		
		sc.close();
	}
}
