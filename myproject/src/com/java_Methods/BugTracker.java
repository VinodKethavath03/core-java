package com.java_Methods;

public class BugTracker {
	Integer bugId;
	String applicationName;
	String bugTitle;
	String severity;
	Integer priority;
	String status;
	String assignedDeveloper;
	
	void bugId() {
		System.out.println("BugId:"+bugId);
		
	}
	
	void applicationName() {

		System.out.println("ApplicationName:"+applicationName);
		
	}
	void bugTitle() {
		System.out.println("BugTitle:"+bugTitle);
		
	}
	void severity() {
		System.out.println("Severity:"+severity);
		
	}
	void priority() {
		System.out.println("Priority:"+priority);
		
	}
	void status() {
		System.out.println("Status:"+status);
		
	}
	void assignedDeveloper() {
		System.out.println("AssignedDeveloper:"+assignedDeveloper);
	}
	void assignToDeveloper(Integer bugId,String developerName) {
		System.out.println(bugId+" "+developerName);
		// status="InDevelopment";
		
		
	}
	void updateStatus(String newStatus) {
		System.out.println(newStatus);
	}
	void bugSummary() {
		System.out.println("BugId:"+bugId);
		System.out.println("ApplicationName:"+applicationName);
		System.out.println("BugTitle:"+bugTitle);
		System.out.println("Severity:"+severity);
		System.out.println("Priority:"+priority);
		System.out.println("Status:"+status);
		System.out.println("AssignedDeveloper:"+assignedDeveloper);
		System.out.println();
		assignToDeveloper(1003,"Akilesh");
		updateStatus("InDevelopment");
		
	}
	
	
	
	public static void main(String[] args) {
		BugTracker b1=new BugTracker();
		b1.bugId=1001;
		b1.applicationName="MOULI IT SOLUTIONS";
		b1.bugTitle="ErrorDetection";
		b1.severity="high";
		b1.priority=1;
		b1.status="Active";
		b1.assignedDeveloper="Rakesh";
		
		b1.bugSummary();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
