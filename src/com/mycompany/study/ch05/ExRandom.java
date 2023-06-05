package com.mycompany.study.ch05;

public class ExRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 45;
		int random1 = (int)((Math.random()*(max - min)) + min);
		int random2 = (int)((Math.random()*(max - min)) + min);
		
		System.out.println("random : "+ random1);
		int val = 0;
		int val2 = 0;
		int sum = 0;
		
		val = random1;
		val2 = random2;
		sum = val + val2;
		System.out.println(val);
		System.out.println(val2);
		
		System.out.println("sum : "+sum);
		
	}

}
