package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;


public class Assignment91 /*"WAP on Collection Methods:
add()
addAll()
clear()
remove()
removeAll()
size()
isEmpty()
contains()
containsAll()
iterator()"
*/

{
	public static void main(String[] args) 
	{
		Collection<String> s1=new ArrayList<String>();
		
		s1.add("tina");
		s1.add("Tony");
		s1.add("Sony");
		s1.add("Rony");
		
		System.out.println(s1);
		
	Collection<String> s2=new ArrayList<String>();
		
		s2.add("rina");
		s2.add("pony");
		
		System.out.println(s2);
		
		s1.addAll(s2);
		System.out.println(s1);
		
		s2.clear();
		System.out.println(s2);
		
		s1.remove("Rony");
		System.out.println(s1);
		
		Collection<String> s3=new ArrayList<String>();

		s3.add("wina");
		s3.add("zony");
		
		s1.addAll(s3);
		System.out.println(s1);
		
		s1.removeAll(s3);
		System.out.println(s1);
		System.out.println(s1.size());
		System.out.println(s1.isEmpty());
		System.out.println(s1.contains("Tony"));
		System.out.println(s1.containsAll(s2));
		
		Iterator <String> i1=s1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	
	}
}
