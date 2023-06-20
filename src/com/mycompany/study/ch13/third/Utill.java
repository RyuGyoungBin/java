package com.mycompany.study.ch13.third;

public class Utill {

//	public Box boxing(String a)
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<>();
		return box;
	}
}
