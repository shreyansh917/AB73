package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment63 //"WAP to accept all the values of array at run time"
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size ");
		int [] c1 = new int[sc.nextInt()];
		
		for(int i=0;i<c1.length;i++)
		{
			System.out.println("please enter the value of index5" +i);

			c1 [i] = sc.nextInt();
		}
		
		
		System.out.println(Arrays.toString(c1));
		
		sc.close();
		
	}
}
