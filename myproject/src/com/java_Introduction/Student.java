package com.java_Introduction;

public class Student {
	
	static String collegeNameString="DRK College";
	
	int rollno;
	String name;
	int marks;
	{
		System.out.println("instance block loaded");
	}
	
	static {
		System.out.println("DRK College");//static Block
	}
	
	void DisplayStudentDetails() {
		System.out.println("rollno="+rollno);
		System.out.println("name="+name);
		System.out.println("marks="+marks);
		
	}
	static void DisplayCollegeDetails() {
		System.out.println(collegeNameString);
	}
	
	

	public static void main(String[] args) {
		
		{
			Student s1=new Student();
			s1.rollno = 123;
			s1.name="vinod";
			s1.marks=98;
			s1.DisplayStudentDetails();
			
			
			Student s2=new Student();
			s2.rollno=124;
			s2.name="Ram";
			s2.marks=78;
			s2.DisplayStudentDetails();
			
			
		}
		
		
		

	}

}
