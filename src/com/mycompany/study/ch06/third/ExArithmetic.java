package com.mycompany.study.ch06.third;

public class ExArithmetic {

	public static void main(String[] args) {
		Arithmetic arithmetic = new Arithmetic();
		int a = 3;
		int b = 5;
		System.out.println("add ("+a+", "+b+") : "+arithmetic.add(a,b));
		
		int result;
		
		result = arithmetic.minus(a,b);
		System.out.println("result : "+result);
		
		result = arithmetic.multi(a,b);
		System.out.println("result : "+result);
		
		String x = "장원영";
		String result2;
		result2 = arithmetic.chName(x);
		System.out.println("result2 : "+result2);
		
		arithmetic.tolk("아이");
		
		int result3 = arithmetic.money();
		System.out.println("result3 : "+result3);
		
	}
	

}
