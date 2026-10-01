package com.java_Introduction;

public class Person {
	@Override
	protected void finalize() {
		System.out.println("finalize");
	}
	static void gc4() {
		Person p5=new Person();
	}

	public static void main(String[] args) {
		System.out.println("main method started!!");
		
		Person p1=new Person();
		System.out.println(p1);//1dbd16a6
		
		
		Person p2=new Person();
		System.out.println(p2);//7ad041f3
		Person p3=new Person();
		System.out.println(p3);//251a69d7
		
		//Nullify the Object
		p1=null;
		
		//re-assigning objects
		p2=p3;
		System.out.println(p2);//7ad041f3
		System.out.println(p3);//251a69d7
		
		//anonymous object
		new Person();
		
		gc4();
		
		
		
		
		
		
		System.gc();
		
		
		
		
		

	}

}
