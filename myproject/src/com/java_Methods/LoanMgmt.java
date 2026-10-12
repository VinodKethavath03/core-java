package com.java_Methods;

public class LoanMgmt {
	String custName;
	int loanAmt;
	double interestRate;
	int time;
	double interest;
	double TotalAmt;
	double EMI;
	

	public static void main(String[] args) {
		LoanMgmt l1=new LoanMgmt();
		l1.custName="Vinod kethavath";
		l1.loanAmt=500000;
		l1.interestRate=8.5;
		l1.time=5;
		l1.displayLoanSummary(l1.loanAmt, l1.interestRate,l1.time);
		
		
		LoanMgmt l2=new LoanMgmt();
		l2.custName="RAM";
		l2.loanAmt=850000;
		l2.interestRate=6.5;
		l2.time=4;
		
		
		l2.displayLoanSummary(l2.loanAmt,l2.interestRate,l2.time);
		
		
		

	}

	double interest(int amt, double intrestrate) {

		double SimpleIntrest = (loanAmt * interestRate * time) / 100;

		return SimpleIntrest;

	}

	double TotalAmt(double intrestrate) {
		double totalAmt=loanAmt+time;
		
		
		return totalAmt;
	}

	double EMI(int TotalAmt, int time) {
		double emi=TotalAmt/(time*12);
		return emi;
	}
	void displayLoanSummary(int TotalAmt,double interestRate,int time) {
		System.out.println("LOAN SUMMARY");
		
		 System.out.println("Customer Name : " + custName);
	     System.out.println("Loan Amount   : " + loanAmt);
	     System.out.println("Interest Rate : " + interestRate + "%");
	     System.out.println("Loan Tenure   : " + time + " years");
	     System.out.println("Interest      : " + interestRate);
	     System.out.println("Total Amount  : " + TotalAmt);
	     System.out.println("Monthly EMI   : " + EMI);
	     System.out.println("================================");
		
	}
	
	
	

}

