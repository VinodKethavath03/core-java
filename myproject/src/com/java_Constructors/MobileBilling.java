package com.java_Constructors;

import java.nio.file.ProviderMismatchException;

public class MobileBilling {
	String model;
	int quantity;
	double price;
	double deliveryCharge;

	MobileBilling() {
		this("Oneplus");
		System.out.println("No-Arg constructor called");

	}
	MobileBilling(String model) {
		this(model,2);
		System.out.println("One-Arg constructor called");

	}
	MobileBilling(String model,int quantity) {
		this(model,quantity,40000);
		System.out.println("Two-Arg constructor called");

	}
	MobileBilling(String model,int quantity,double price) {
		this(model,quantity,price,120);
		System.out.println("Three-Arg constructor called");

	}
	MobileBilling(String model,int quantity,double price,double deliveryCharge) {
		this.model=model;
		this.quantity=quantity;
		this.price=price;
		this.deliveryCharge=deliveryCharge;
		System.out.println("Four-Arg constructor called");
	}

	

	public static void main(String[] args) {
		MobileBilling b=new MobileBilling();
		double cost=b.price*b.quantity;
		double TotalBill=cost+b.deliveryCharge;
		b.getMobileInfo();
		System.out.println("TotalBill:"+TotalBill);
		System.out.println(cost);
		

	}
	

	void getMobileInfo() {
		System.out.println("Mobile Model:"+model);
		System.out.println("Price:"+price);
		System.out.println("Quantity:"+quantity);
		System.out.println("DeliveryCharge:"+deliveryCharge);
		
		

	}

}
