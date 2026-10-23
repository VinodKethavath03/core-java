package com.java_Constructors;

import java.security.cert.CollectionCertStoreParameters;
import java.util.zip.CheckedOutputStream;

// no-arg constructors

public class House {
	String apparmentName;
	int flatno;
	String location;
	double price;
	
	
	House(){
		System.out.println("no-arg constructor called");
		apparmentName="Apparna";
		flatno=000;
		location="gandimaissama";
		price=00.00;
		
		
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		House h1=new House();
		h1.flatno=101;
		h1.price=1000000.00;
		
		h1.houseInfo();
		
		House h2=new House();
		h2.flatno=201;
		h2.price=9000000.00;
		
		
		h2.houseInfo();
		System.out.println("main method ended");
				

	}
	void houseInfo() {
		System.out.println("Appartment Name:"+ apparmentName);
		System.out.println("FlatNo:"+flatno);
		System.out.println("Location:"+ location);
		System.out.println("Cost of Flat:"+price);
		System.out.println("*********************");
	}

}
