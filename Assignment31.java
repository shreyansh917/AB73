package practice;

public class Assignment31 //WAP on different Math class methods
{
	public static void main(String[] args) 
	{
		int sum=Math.addExact(70, 80);
		System.out.println(sum);
		System.out.println(Math.subtractExact(50, 20));
		System.out.println(Math.multiplyExact(10, 20));
		
		System.out.println(Math.min(20, 10));
		System.out.println(Math.abs(-555));
		System.out.println(Math.max(40, 60));
		
		System.out.println(Math.random()); // will give random result
		
		System.out.println(Math.sqrt(100));
	}
}
