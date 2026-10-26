package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Assignment80 //WAP using Iterator and Listiterator of an ArrayList
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
		
		System.out.println(a1);
		
		Iterator<Integer> i1= a1.iterator();
		
		while(i1.hasNext()) 
		{
			System.out.println(i1.next());
		}
		System.out.println(a1);
		
		ListIterator<Integer> i2= a1.listIterator();
		
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		while(i2.hasPrevious()) 
		{
			System.out.println(i2.previous());
		}
		System.out.println(a1);
			 
		
	}
}
