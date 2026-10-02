package com.java_DataTypes;

public class Demo4 {
	
	private static final int Sum = 0;
	String StdName;
	int roll_no;
	String Course;
	int Sub1_Marks;
	int Sub2_Marks;
	int Sub3_Marks;
	void displayStudentDetails() {
		System.out.println(StdName+"\n "+roll_no+"\n "+Course+" \n"+Sub1_Marks+"\n "+Sub2_Marks+"\n "+Sub3_Marks);
	}
	
	void total() {
		int Sum=Sub1_Marks+Sub2_Marks+Sub3_Marks;
		System.out.println(Sum);
		
	}
	void Avg() {
		int sum = Sub1_Marks+Sub2_Marks+Sub3_Marks;
		int Avg=sum/3;
		System.out.println(Avg);
	}
	
	

	public static void main(String[] args) {
		Demo4 d=new Demo4();
		d.StdName="rahul";
		d.roll_no=123;
		d.Course="JFS";
		d.Sub1_Marks=89;
		d.Sub2_Marks=98;
		d.Sub3_Marks=78;
		d.displayStudentDetails();
		d.Avg();
		
		
		
		Demo4 d1=new Demo4();
		d1.StdName="akhilesh";
		d1.roll_no=124;
		d1.Course="JFS";
		d1.Sub1_Marks=78;
		d1.Sub2_Marks=57;
		d1.Sub3_Marks=92;
		d1.displayStudentDetails();
		d1.Avg();
		
			
		

	}
	

}
