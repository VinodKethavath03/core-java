package com.java_Methods;

import java.util.Scanner;

public class EmployeeSalaryInfo {
	Scanner sc = new Scanner(System.in);

	 void main(String[] args) {
		
		System.out.println("main method started");
		double basic=getBasic();
		double hra=getHouseRentAllowance();
		double lta=getHouseRentAllowance();
		double mc= mealCoupons();
		double pf=getPF();
		double gratuity=getGratuity();
		System.out.println("total Fixed Compensation:"+(basic + hra + lta + mc + pf + gratuity));
		
		System.out.println("main method ended");

	}

	double getBasic() {
		System.out.println("Enter Basic Salary:");
		double basic = sc.nextDouble();
		return basic;

	}

	double getHouseRentAllowance() {
		System.out.println("Enter HRA:");
		double hra = sc.nextDouble();
		return hra;

	}

	double getLeaveTravelAssistence() {
		System.out.println("Enter LTA:");
		double lta = sc.nextDouble();
		return lta;
	}

	double mealCoupons() {
		System.out.println("Enter Meal amount:");
		double mc = sc.nextDouble();
		return mc;
	}
	double getPF() {
		System.out.println("Enter PF amount:");
		double pf=sc.nextDouble();
		return pf;
	}
	double getGratuity() {
		System.out.println("Enter Gratuity:");
		double gratuity=sc.nextDouble();
		return gratuity;
	}

}
