package com.mycompany.study.ch07.second;

public class ExStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 명시적 생성자를 사용하여 객체를 생성하고 
				// 모들 필드를 출력하시요
				
				Student student = new Student("Tony", "1234-1234", 21);
				
				System.out.println(student.name);
				System.out.println(student.ssn);
				System.out.println(student.studentNo);
				
				
				Student student2 = new Student("Crystal", "4321-4321");
				
				System.out.println(student2.name);
				System.out.println(student2.ssn);
				System.out.println(student2.studentNo);
				
				Student student3 = new Student("ABC", 3);
				
				System.out.println(student3.ssn);
				System.out.println(student3.name);
				System.out.println(student3.studentNo);
	}

}

