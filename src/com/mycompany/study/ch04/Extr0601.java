package com.mycompany.study.ch04;

public class Extr0601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int 타입의 변수 2개 선언하고
		//두 정수가 주어졌을때 사분면 어디에 해당되는지 출력하는 프로그램을 작성하시요
		
		int x = 3;
		int y = 1;
		
		if(!(x == 0) && !(y == 0)) {
			if(x > 0 && y > 0) {
				System.out.println("("+x+", "+y+")은 1사분면입니다");
			} else if (x>0 && y<0) {
				System.out.println("("+x+", "+y+")은 4사분면입니다");
			} else if (x<0 && y>0) {
				System.out.println("("+x+", "+y+")은 2사분면입니다");
			} else {
				System.out.println("("+x+", "+y+")은 3사분면입니다");
			}
		} else if(x==0 && y!=0) {
			System.out.println("("+x+", "+y+")은 Y축 위에 존재합니다");
		} else if (y==0 && x!=0) {
			System.out.println("("+x+", "+y+")은 X축 위에 존재합니다");
		} else {
			System.out.println("("+x+", "+y+")은 원점에 존재합니다");
		}
		
		// int 타입의 변수를 3개 선언하고
		// 세 정수중에서 최댓값, 최솟값을 구하는 프로그램을 작성하시요
		
		int a = 3;
		int b = 3;
		int c = 3;
		
		if (a != b && b != c) {
			if(a>b && a>c) {
				System.out.println("최댓값 a: "+a);
			} else if(b>a && b>c) {
				System.out.println("최댓값 b: "+b);
			} else if (c>a && c>b) {
				System.out.println("최댓값 c: "+c);
			}
			if(a<b && a<c) {
				System.out.println("최솟값 a: "+a);
			} else if(b<a && b<c) {
				System.out.println("최솟값 b: "+b);
			} else if (c<a && c<b) {
				System.out.println("최솟값 c: "+c);
			}
			
		} else {
			System.out.println("같은 값이 2개이상 존재합니다");
		}
		
		//사장, 부장 과장, 대리 , 주임, 사원, 나
		//사장의 연봉은 얼마 입니다.
		
		String position = "사장";
		switch (position) {
		case "사장":
			System.out.println("사장의 연본은 없습니다");
			break;
			
		case "부장":
			System.out.println("사장의 연본은 5,000입니다");
			break;
			
		case "과장":
			System.out.println("사장의 연본은 4,000입니다");
			break;
			
		case "대리":
			System.out.println("사장의 연본은 3,000입니다");
			break;

		case "주임":
			System.out.println("사장의 연본은 2,000입니다");
			break;
			
		case "사원":
			System.out.println("사장의 연본은 1,000습니다");
			break;
			
		case "나":
			System.out.println("사장의 연본은 없습니다");
			break;
		default:
			System.out.println("이 직업이 아닙니다");
			break;
		}
		
		// 1부터 10까지 더하는 프로그램 작성
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합: " + sum);
		
		// 11~50까지 짝수의 합을 구하시오
		sum=0;
		for(int i=11; i<=50; i++) {
			if(i%2==0) {
				sum +=i;
			}
		}
		System.out.println("11부터 50까지 짝수의 합: " + sum);

		// 2단 부터 출력되는 구구단 프로그램을 작성하시오
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i+"*"+j+"="+ i*j);
			}
			System.out.println("---------------");
		}
		
		//1부터 10까지 더하는 프로그램 작성
		int i =1;
		sum =0;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("1부터 10까지의 합: " + sum);
		
		//**********
		//**********
		//**********
		//**********
		//**********
		for(int o=1; o<=5; o++) {
			for(int k=1; k<10; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("----------");
		
		//**********
		//*        *    
		//*        *    
		//*        *    
		//**********
		
		for(int o=1; o<=5; o++) {
			for(int k=1; k<=10; k++) {
				if(o==1||o==5) {
					System.out.print("*");
				} else {
					if(k==1||k==10) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
		
		
		
		

	}

}
