package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test3 

{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Shyam");
		list.add("Ram"); 
		list.add("Anil"); 
		list.add(null); 
		list.add(null); 
		
		System.out.println("List: " + list);
		
		Set<String> set = new HashSet<String>(list);
	
		System.out.println("Set: " + set);
	}
}
