package practice;

public class Assignment67 //WAP to find out the average of all the numbers that we have in array
{
	public static void main(String[] args) 
	{
		int [] a= new int [5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=60;
		
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println(sum);
		double d1=sum/a.length;
		System.out.println(d1);
		
	}
}
