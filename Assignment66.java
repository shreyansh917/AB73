package practice;

import java.util.Arrays;


public class Assignment66 //WAP to check if we can copy the value of 1 array into another in reverse order
{
	public static void main(String[] args) 
	{
		int a [] =new int [5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		int b [] =new int [a.length];
		
		for(int i=0, j=a.length-1;i<a.length;i++,j--)
		{
			b[j] = a[i];
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}
}
