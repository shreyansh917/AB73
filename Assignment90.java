package practice;

import java.util.HashSet;
import java.util.Iterator;

public class Assignment90 /*"WAP on Set Methods:
add()
addAll()
clear()
remove()
removeAll()
size()
isEmpty()
contains()
containsAll()
iterator()
*/

{
	public static void main(String[] args) 
	{
		HashSet<String> s1=new HashSet<String>();
		
		s1.add("Radha");
		s1.add("Shyam");
		s1.add("Tony");
		s1.add("Bony");
		s1.add("Nita");
		
		HashSet<String> s2=new HashSet<String>();
		s2.add("Hema");
		s2.add("Tina");
		
		HashSet<String> s3=new HashSet<String>();
		s3.add("lita");
		s3.add("jiya");

		System.out.println(s1);
		System.out.println(s2);
		
		s1.addAll(s2);
		System.out.println(s1);
		
		s2.clear();
		System.out.println(s2);
		
		s1.remove("Tina");
		System.out.println(s1);
		
		s1.addAll(s3);
		System.out.println(s1);
		
		s1.removeAll(s3);
		System.out.println(s1);

	
		System.out.println(s1.size());
		
		System.out.println(s1.isEmpty());
		
		System.out.println(s1.contains("Tony"));

		
		System.out.println(s1.containsAll(s2));
		
		Iterator<String> i1 =s1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
