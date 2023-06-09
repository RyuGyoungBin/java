package com.mycompany.study.ch06.tr.third;

public class ExArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arithmetic arithmetic = new Arithmetic();
		int result = arithmetic.add(1, 1);
		System.out.println("result : "+result);
		
		arithmetic.EngName("장원영");
		
		int result2 = arithmetic.taken();
		System.out.println("result2 : "+result2);
		

	}

}
