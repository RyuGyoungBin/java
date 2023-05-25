package com.mycompany.study.ch02;

public class Ex0525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Boolean
		boolean defaultNy = true;
		
		if(defaultNy) {
			System.out.println("기본값입니다.");
		} else {
			System.out.println("여분값입니다.");
		}
		
		//byte
		
		byte byte1 = -128;
		byte byte2 = 127;
		System.out.println("byte1 : " + byte1);
		System.out.println("byte2 : " + byte2);
		
		//char
		char var1 = 'A';
		char var2 = '가';
		//char var3 = "A" ""사용 불가
		//char var4 = 'AA' 문자두개 불가
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		
		//float double
		float float1 = 3.14f;
		float float2 = 3.14F;
		double double1 = 3.14;
		double double2 = 1234567;
		double double3 = 123456789;
		System.out.println("float1 : " + float1);
		System.out.println("float2 : " + float2);
		System.out.println("double1 : " + double1);
		System.out.println("double2 : " + double2);
		System.out.println("double3 : " + double3);
		//int
		int int1 = 10;
		int int2 = 012;
		System.out.println("int1 : " + int1);
		System.out.println("int2 : " + int2);
		//long
		long long1 = 12344567;
		long long2 = 12345678900L;
		System.out.println("long1 : " + long1);
		System.out.println("long2 : " + long2);
		//promotion
		// byte < short < int < long < float < double
		
		byte byteVar = 10;
		System.out.println("byteVar : " + byteVar);
		short shortVar = byteVar;
		System.out.println("shortVar : " + shortVar);
		int intVar = shortVar;
		System.out.println("intVar : " + intVar);
		long longVar = intVar;
		System.out.println("longVar : " + longVar);
		float floatVar = longVar;
		System.out.println("floatVar : " + floatVar);
		double doubleVar = floatVar;
		System.out.println("doubleVar : " + doubleVar);
		
	}

}
