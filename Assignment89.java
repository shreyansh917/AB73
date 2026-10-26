package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Assignment89 /*"WAP on List methods:
add()
add(index, element)
addAll()
get()
set()
remove(index)
remove(object)
contains()
indexOf()
size()
isEmpty()
clear()
iterator()
listIterator()"
*/
{
	public static void main(String[] args) 
	{
		ArrayList<String> s1= new ArrayList<String>();
		
		s1.add("java");
		s1.add("python");
		s1.add(null);
		s1.add("Ram");
		s1.add("Shyam");
		s1.add(0, "Shreyansh");

		ArrayList<String> s2= new ArrayList<String>();
		s2.add("Radha");
		s2.add("Krishna");

		
		System.out.println(s1);
		System.out.println(s2);

		s1.addAll(0, s2);
		System.out.println(s1);
		
		System.out.println(s1.get(0));
		
		s1.set(0, "Ramesh");
		System.out.println(s1);
		s1.remove(0);
		System.out.println(s1);
		
		s1.remove("Ram");
		System.out.println(s1);
		
		System.out.println(s1.contains("Shyam"));
		System.out.println(s1.indexOf("Shyam"));

		System.out.println(s1.size());
		System.out.println(s1.isEmpty());
		
		s2.clear();
		System.out.println(s2);
		
		Iterator<String> s3 =s1.iterator();
		
		while(s3.hasNext())
		{
			System.out.println(s3.next());
		}
		
		ListIterator<String> i2=s1.listIterator();
		
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
	}
}
