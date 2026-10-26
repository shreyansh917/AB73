package practice;

import java.util.Scanner;

public class Assignment33 //"WAP to calculate  area & circumference using scanner class for Circle"

						//Shape 	Area 	Circumference
						//Circle 	pi*r*r 	2*pi*r
						//Triangle 	0.5*b*h a+b+c
						//Square 	a*a 	4*a
						//Rectangle l*b 	2*(l+b)


{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter radiuos of circle");
		
		double radious = sc.nextDouble();
		
		double area = Math.PI * radious * radious;
		double circumference = 2* Math.PI *radious;
		
		System.out.println(area);
		System.out.println(circumference);
		sc.close();
	}
}
