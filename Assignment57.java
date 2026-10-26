package practice;

import java.util.Arrays;

public class Assignment57 //"WAP on String function:length() toUppercase() toLowerCase SubString(Start index) SubString(start index,end index) replace() replaceAll() trim() charAt() concate() split()"
{
	public static void main(String[] args) 
	{
		String a = "Banglore ";
		
		
		System.out.println(a.length());
		
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.substring(2));
		System.out.println(a.substring(2,6));
		System.out.println(a.replace('a','o'));
		System.out.println(a.replaceAll("o","i"));
	
		
		
		System.out.println(a.concat(" test"));

		String b= "test is test";
		
		String [] s1=b.split(" ",3);
		
		System.out.println(Arrays.toString(s1));
		
		
		
		
		
	
		
	}
}

