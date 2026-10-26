package practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment92 //Write a program to iterate Map elements using all iteration methods: entrySet(), keySet(), values(), and Iterator.
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> s1=new HashMap<Integer,String>();
		
		s1.put(11, "Ram");
		s1.put(12, "Kam");
		s1.put(13, "Pam");
		s1.put(14, "Wam");
		
		System.out.println(s1);
		
		Collection<String> m1 = s1.values();
		
		System.out.println("All values");
		
		for(String v1 : s1.values())
		{
			System.out.println(v1);
		}
		
		Set<Integer> m2=s1.keySet();
		
		System.out.println("All keys");

		
		for(Integer v2:s1.keySet()) 
		{
			System.out.println(v2);
		}
		
		Set<Entry<Integer, String>> m3 = s1.entrySet();
		
		System.out.println("All keys & value");
		for(Entry<Integer, String> v3:s1.entrySet())
		{
			System.out.println(v3);
		}

		Iterator<Entry<Integer, String>> s6=m3.iterator();
		
		System.out.println("by iterator");
		while(s6.hasNext())
		{
			System.out.println(s6.next());
		}
	}
}

