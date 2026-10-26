package practice;

import java.util.Arrays;

public class Assignment64 // WAP to check if the 2 arrays are equals
{
	public static void main(String[] args) 
	{
		int [] a = new int [4];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		System.out.println(Arrays.toString(a));
		
		
		int [] b = new int [4];
		
		b[0]=10;
		b[1]=20;
		b[2]=30;
		b[3]=40;
		
		System.out.println(Arrays.toString(b));
		
		if(Arrays.equals(a, b))
		{
			System.out.println("Yes they are equal");
		}
		else 
		{
			System.out.println("no they are not equal");

		}
		
	}
}
