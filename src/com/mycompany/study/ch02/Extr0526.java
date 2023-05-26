package com.mycompany.study.ch02;

public class Extr0526 {
	public static final String MY_NAME = "Tony";
	public static final double PIA = 3.14;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MY_MANE : " + MY_NAME);
		
		// double > float > long > int > short > byte
		double doubleVar = 123456789;
		System.out.println("doubleVar : " + doubleVar);
		float floatVar = (float)doubleVar;
		System.out.println("floatVar : " + floatVar);
		long longVar = (long)floatVar;
		System.out.println("longVar : " + longVar);
		int intVar = (int)longVar;
		System.out.println("intVar : " + intVar);
		short shortVar = (short)intVar;
		System.out.println("shortVar : " + shortVar);
		byte byteVar = (byte)shortVar;
		System.out.println("byteVar : " + byteVar);
		
		String stringVar = String.valueOf(byteVar);
		System.out.println("stringVar : " + stringVar);
		
		int intVar2 = Integer.parseInt(stringVar);
		System.out.println("intVar2 : " + intVar2);
		
	}

}
