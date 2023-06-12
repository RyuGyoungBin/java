package com.mycompany.study.ch06.seventh;

public class ExPersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persion persion = new Persion(null, "1234", "장원영");
		
		//persion.nation = "미국";	//final은 중간에 값 대입 불가능
		//persion.ssn = "묻지마";		//final은 중간에 값 대입 불가능
		persion.name = "Tony";
	}

}
