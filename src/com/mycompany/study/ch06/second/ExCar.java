package com.mycompany.study.ch06.second;

public class ExCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car2 = new Car(6,"쏘나타","블랙","현대자동차");
		Car car = new Car("화이트");
		
		
		System.out.println(car.name);
		System.out.println(car.engine);
		System.out.println(car.color);
		System.out.println(car.company);
		System.out.println("----------");
		System.out.println(car2.name);
		System.out.println(car2.engine);
		System.out.println(car2.color);
		System.out.println(car2.company);
		car.go();
	}

}
