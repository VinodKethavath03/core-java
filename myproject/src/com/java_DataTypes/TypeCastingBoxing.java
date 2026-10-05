package com.java_DataTypes;

public class TypeCastingBoxing {

	public static void main(String[] args) {
		  // Primitive Data Type
        int number = 100;

        // Widening Casting
        long bigNumber = number;

        // Narrowing Casting
        byte smallNumber = (byte) number;

        // Autoboxing
        Integer wrapperNumber = number;

        // Unboxing
        int primitiveNumber = wrapperNumber;

        System.out.println("Original Number: " + number);

        System.out.println("Widening: " + bigNumber);

        System.out.println("Narrowing: " + smallNumber);

        System.out.println("Autoboxing: " + wrapperNumber);

        System.out.println("Unboxing: " + primitiveNumber);
    


	}

}
