package com.mycompany.study.ch06.tr.first;

import java.util.Date;

public class Member {
	//field
	
	String member;
	String id;
	String password;
	String email;
	String address;
	Date date;
	
	//method
	
	void searchId() {
		System.out.println("아이디를 조회합니다.");
	}
	void searchEmail() {
		System.out.println("이메일을 조회합니다.");
	}
	void searchMember() {
		System.out.println("회원을 조회합니다.");
	}
	void searchAddress() {
		System.out.println("주소를 조회합니다.");
	}
	
}
