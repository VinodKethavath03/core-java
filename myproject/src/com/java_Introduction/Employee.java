package com.java_Introduction;

public class Employee {
	//create instance variable
	int empId;
	String empName;
	int salary;
	
	//static variable
	static String companyName;
	static {
		companyName="VCube";
		System.out.println("static block executed");
		
	}
	{
		System.out.println("Instance block executed");
	}

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.empId=101;
		emp1.empName="chandu";
		emp1.salary=7000;
		
		
		Employee emp2=new Employee();
		emp2.empId=102;
		emp2.empName="Ram";
		emp2.salary=10000;
		
		System.out.println(emp1.empId+" "+emp1.empName+" "+emp1.salary);
		System.out.println(emp2.empId+" "+emp2.empName+" "+emp2.salary);
		
		
		
		

	}

}
