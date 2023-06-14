package com.mycompany.study.ch07.EX;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r = 7;
		
		System.out.println("원의 반지름: "+ r);
		System.out.println();
		Calculator calculator = new Calculator();
		
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적: " + calculator.param(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적: " + computer.param(r));
		System.out.println();
		
		
	}

}
