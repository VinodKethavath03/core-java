package com.java_Constructors;

public class TestDemo1 {
	static int count;
	TestDemo1(){
		count++;
	}
		


	public static void main(String[] args) {
		TestDemo1 t1=new TestDemo1 ();
		TestDemo1 t2=new TestDemo1 ();
		TestDemo1 t3=new TestDemo1 ();
		TestDemo1 t4=new TestDemo1 ();
		TestDemo1 t5=new TestDemo1 ();
		TestDemo1 t6=new TestDemo1 ();
		System.out.println("Total no of Objects:"+count++);
		

	}

}
