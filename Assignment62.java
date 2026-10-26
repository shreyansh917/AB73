package practice;

import java.util.Arrays;

public class Assignment62 /**"Write a Java program to create three arrays:An integer array for roll numbers A String array for student names A double array for marks"
*/
{
	public static void main(String[] args) 
	{
		int [] rolno = new int [4];
		
		rolno[0] =10;
		rolno[1] =20;
		rolno[2] =30;
		rolno[3] =40;
		
		System.out.println(Arrays.toString(rolno));
		
		
		String [] studentname = new String[4];
		
		studentname[0]="suraj";
		studentname[1]="shreyansh";
		studentname[2]="parth";
		studentname[3]="raj";
		System.out.println(Arrays.toString(studentname));
		
		double [] marks = new double[4];
		
		marks[0]=10.2;
		marks[1]=15.2;
		marks[2]=19.2;
		marks[3]=20.2;
		
		System.out.println(Arrays.toString(marks));

		
		
	}
}
