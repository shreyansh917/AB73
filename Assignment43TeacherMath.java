package practice;

public class Assignment43TeacherMath extends Assignment43Teacher
{
	static void mathTeacher() 
	{
		System.out.println("This is Math Teacher class");
	}
	
	void mathTeachernonstatic() 
	{
		System.out.println("This is non static method of Math Teacher class");
	}
	
	public static void main(String[] args) 
	{
		mathTeacher();//static method of Math Teacher class
		teacher();//static method of Teacher class
		person();//static method of Person class
		
		
		Assignment43TeacherMath k1 = new Assignment43TeacherMath();
		k1.mathTeachernonstatic();//non-static method of Math Teacher class
		k1.teachernonstatic();//non-static method of Teacher class
		k1.personnonstatic();//non-static method of Person class
		
		Assignment43Student s1 = new Assignment43Student();
		s1.studentnonstatic();//non-static method of Student class
		s1.personnonstatic();//non-static method of Person class
	
		s1.student();//static method of Student class

	}
}
