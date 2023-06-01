package com.mycompany.study.ch04;

public class ExForHigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 10*5
		//**********
		//**********
		//**********
		//**********
		//**********
		
		for(int i=1; i<= 5; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("-----------");
		
		//2.(1, 5) 출력
		//**********
		//*        *    
		//*        *    
		//*        *    
		//**********
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				if(i == 1 || i == 5) {
					System.out.print("*");
				} else {
					if(j == 1 || j == 10) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				
			}
			System.out.println("");
		}
		//1
		//
	}

}
