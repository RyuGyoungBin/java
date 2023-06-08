package com.mycompany.study.ch06.tr.second;

public class ExCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Car car2 = new Car("화이트");
		Car car3 = new Car("차","블랙","회사");
		
		System.out.println("car.name : "+car.name);
		System.out.println("car.color : "+car.color);
		System.out.println("car.company : "+car.company);
		car.go();
		System.out.println("----------");
		System.out.println("car2.name : "+car2.name);
		System.out.println("car2.color : "+car2.color);
		System.out.println("car2.company : "+car2.company);
		car.back();
		System.out.println("---------");
		System.out.println("car3.name : "+car3.name);
		System.out.println("car3.color : "+car3.color);
		System.out.println("car3.company : "+car3.company);
		car.go();
	}

}
