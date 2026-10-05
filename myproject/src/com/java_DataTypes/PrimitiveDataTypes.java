package com.java_DataTypes;

public class PrimitiveDataTypes {
	/*
	 * 1byte=8bits=-128 to 127
	 * by default RHS numeric values are int so cannot convert into bytes directly. 
	 */
	byte b=127;
	byte b1=(byte)128;
	byte b2=(byte)130;
	
	/*
	 * short=2bytes=16bits=-32768 to 32767
	 */
	short s= 32767;
	short s1= (short)32768;// converting into short 
	
	/*
	 * int = 4 bytes=32 bits= -2147483648 to 2147483647
	 */
	int i=2147483647;
	// literals out range is 2147483648
	//int i1=2147483648;
	int i2=(int)2147483648L;
	
	long l=234849200201L;//int can convert directly into long is called implicit type casting
	long l1=i2;// implicit type casting
	
	
	float f=5.5f;
	float f1=100;//int converts into float// implicit type casting
	
	
	double d=3.14456555555444;
	double d1=35.1445444444444444444455444D;
	
	
	// char =2 bytes
	char c='M';
	/*
	 * 65=A, 66=B, 67=C, 68=D,..........90=Z
	 * 97=a, 98=b,.............................122=z
	 */
	char c1=72;//ASCII Code values:0 to 127 values
	int i3= 'A';//char can store it into int---implicit
	
	
	boolean boo1=true;
	boolean boo=false;
	
	
	

	public static void main(String[] args) {
		System.out.println("main method started");
		PrimitiveDataTypes t =new PrimitiveDataTypes();
		
		
		System.out.println("byte value:"+t.b);//0
		System.out.println("byte value:"+t.b1);//-128
		System.out.println("byte value:"+t.b2);//-126(127+3=-126)   converting int to byte is called Explicit TypeCasting
		
		System.out.println("short value:"+t.s);//0
		System.out.println("short value:"+t.s1);//0
		
		
		System.out.println("int value:"+t.i);//0
		System.out.println("int value:"+t.i2);
		System.out.println("int value:"+t.i3);
		
		System.out.println("long value:"+t.l);//0
		System.out.println("long value:"+t.l1);//0
		
		System.out.println("float value:"+t.f);//0.0
		System.out.println("float value:"+t.f1);//0.0
		System.out.println("double value:"+t.d);//0.0
		System.out.println("double value:"+t.d1);//0.0
		
		System.out.println("char value:"+t.c);
		System.out.println("char value:"+t.c1);
		System.out.println("boolean value:"+t.boo);//false
		System.out.println("boolean value:"+t.boo1);//true
		
		System.out.println("main method ended");
		
		

	}

}
