package practice;

public class Assignment19 //WAP using switch case to display days of the week:1 for Monday,2 for Tuesday etc 7 for Sunday.if the input is not in between 1-7 ,print "Invalid Day"
{
	public static void main(String[] args) 
	{
		int value= 8;
		switch (value)
		{
		case 1 : System.out.println("monday");
		break;
		
		case 2 : System.out.println("tuesday");
		break;
		
		case 3 : System.out.println("wednesday");
		break;
		
		case 4 : System.out.println("thursady");
		break;
		
		case 5 : System.out.println("friday");
		break;
		
		case 6 : System.out.println("saturday");
		break;
		
		case 7 : System.out.println("sunday");
		break;
		
		case 8: System.out.println("Invalid day");
		break;
		}

	}
}
