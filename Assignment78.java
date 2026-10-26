package practice;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment78 
/*"WAP on Collections method:

1) sort()
2) reverse()
3) shuffle()
4) max()
5) min()
6) swap()
7) binarySearch()
8)frequency()
9)add()
*/

{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(10);
		a1.add(30);
		a1.add(60);
		a1.add(50);
		a1.add(30);
		a1.add(50);
		
		System.out.println(a1);
		
		Collections.swap(a1, 0, 2);
		System.out.println(a1);
		
		Collections.sort(a1);
		System.out.println(a1);
		
		Collections.reverse(a1);
		System.out.println(a1);
		
		Collections.shuffle(a1);
		System.out.println(a1);
		
		System.out.println(Collections.max(a1));
		System.out.println(Collections.min(a1));
		
		Collections.sort(a1); //Collections.binarySearch() requires the list to be sorted in ascending order when using the default natural ordering. Otherwise, it may return an incorrect result.
		int b1=Collections.binarySearch(a1, 60);
		System.out.println(b1);
		
		int b2=Collections.frequency(a1, 30);
		System.out.println(b2);
		
		a1.add(80);
		System.out.println(a1);
		
		
	}
	
}
