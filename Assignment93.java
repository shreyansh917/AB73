package practice;

import java.util.HashMap;

public class Assignment93 /*"WAP for Map using all its methods:
put()
putAll()
replace()
putIfAbsent()
isEmpty()
clear()
size()
remove()"
*/

{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> s2 = new HashMap<Integer, String>();
		
		s2.put(12, "ram");
		s2.put(13, "pam");
		s2.put(14, "tam");
		s2.put(15, "cam");
		
		System.out.println(s2);
		
		HashMap<Integer, String> s3 = new HashMap<Integer, String>();
		
		s3.put(16, "yam");
		s3.put(17, "oam");
		
		System.out.println(s3);
		
		s2.putAll(s3);
		System.out.println(s2);
		
		s2.replace(12, "ram", "Shreyansh");
		System.out.println(s2);
		s2.putIfAbsent(18, "neha");
		System.out.println(s2);
		
		System.out.println(s2.isEmpty());
		
		System.out.println(s2.size());
		
		s2.remove(18);
		System.out.println(s2);
		
		s2.clear();
		System.out.println(s2);

		
	}
}
