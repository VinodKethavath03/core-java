package com.java_Methods;

public class TestDemo1 {
	static int a=10;
	static int b=20;
	static int addition() {
		
		int Sum = a+b;
		return Sum;
		
	}
	static int subtraction() {
		int Sub=b-a;
		return Sub;
		
	}
	static int multiplication() {
		int Mul=a*b;
		return Mul;
	}
	static int division() {
		int Div=b/a;
		return Div;
		
	}

	public static void main(String[] args) {
		int sum=addition();
		System.out.println("Addition="+sum);
		
		int Sub=subtraction();
		System.out.println("Subtraction="+Sub);
		
		int Mul=multiplication();
		System.out.println("Multiplication="+Mul);
		
		int Div=division();
		System.out.println("Division="+Div);
		
		
		
		

	}

}
