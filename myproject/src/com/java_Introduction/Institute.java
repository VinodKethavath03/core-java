package com.java_Introduction;

public class Institute {
	static String trainerName1="Srikanth";
	static String trainerName2="Viswa";
	int emp_id;
	String empName;
	String empDesign;


	public static void main(String[] args) {
		
		Institute emp1=new Institute();
		emp1.emp_id=101;
		emp1.empName="ram";
		emp1.empDesign="s/w E";
		
		
		Institute emp2=new Institute();
		emp2.emp_id=102;
		emp2.empName="chandu";
		emp2.empDesign="h/w E";
		
		
		
		Institute emp3=new Institute();
		emp3.emp_id=103;
		emp3.empName="Moulali";
		emp3.empDesign="manager";
		
		
		
		
		Institute emp4=new Institute();
		emp4.emp_id=104;
		emp4.empName="ruthvik";
		emp4.empDesign="hr";
		
		
		
		
		Institute emp5=new Institute();
		emp5.emp_id=105;
		emp5.empName="vinod";
		emp5.empDesign="s/w E";
		
		
		System.out.println(emp1.emp_id+" "+emp1.empName+" "+emp1.empDesign);
		System.out.println(emp2.emp_id+" "+emp2.empName+" "+emp2.empDesign);
	
	
	
	
	

	}

}
