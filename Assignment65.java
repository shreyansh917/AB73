package practice;

import java.util.Arrays;

public class Assignment65 //WAP to check if we can copy the value of 1 array into another
{
	public static void main(String[] args) 
	{
		int [] a = new int [4];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		
		int [] b= new int [a.length];
		
		for(int i=0;i<a.length;i++)
		{
			b [i] = a[i];
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
	}
}
