package com.java_Methods;

import java.util.Scanner;

// methods with return type + with parameters
//area of triangle= 0.5*base* height
//area of circle = pi*r*r
// area of square=side * side
//area of rectangle= length*breadth

public class FindAreas {

	 void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Base:");
		double base=sc.nextDouble();
		
		System.out.println("Enter Height:");
		double height=sc.nextDouble();
		double areaTri=areaOfTriangle(base,height);
		System.out.println("Area of Triangle:"+areaTri);
		System.out.println("**************************************");
		
		
		System.out.println("Enter Radius:");
		double radius=sc.nextDouble();
		double areaC=areaOfCircle(radius);
		System.out.println("Area of Circle:"+ areaC);
		System.out.println("**************************************");
		
		
		System.out.println("Enter Side:");
		double side=sc.nextDouble();
		double areaSq=areaOfSquare(side);
		System.out.println("Area of Square:"+ areaSq);
		System.out.println("**************************************");

	}
	double areaOfTriangle(double b, double h) {
		double areaTri=0.5*b*h;
		return areaTri;
		
	}
	double areaOfCircle(double radius) {
		return Math.PI*radius*radius;
	}
	
	double areaOfSquare(double side) {
		double areaSq=side*side;
		return areaSq;
	}
	

}
