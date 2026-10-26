package practice;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment79 
/*"Write a program to demonstrate below methods of ArrayList:
add(Integer e)
add(int Index,Integer element)
addAll(collection)
contains(Object)
containsAll()
remove(int index)
remove(Object)
removeAll(collection)
clear()
isEmpty()
get()
equals()"
*/

{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();

		
		a1.add(10);
		a1.add(30);
		a1.add(60);
		a1.add(50);
		a1.add(30);
		a1.add(50);
		a2.add(400);
		a2.add(300);
		a2.add(900);
		
		System.out.println(a1);
		System.out.println(a2);
		
		
		a1.add(90);
		System.out.println(a1);
		a2.add(0, 100);
		System.out.println(a2);
		
		a1.addAll(0, a2);
		System.out.println(a1);
		System.out.println(a1.contains(20));
		System.out.println(a1.containsAll(a2));
		a1.remove(3);
		System.out.println(a1);
		a1.removeAll(a2);	
		System.out.println(a1);
		
		System.out.println(a1.isEmpty());
		System.out.println(a1.get(2));

		System.out.println(a1.equals(a2));
		
	}
	
}
