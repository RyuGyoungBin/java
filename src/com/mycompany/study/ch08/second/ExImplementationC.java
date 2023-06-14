package com.mycompany.study.ch08.second;

public class ExImplementationC{

	public static void main(String[] args) {

		InterfaceA interfaceA = new IimplementationC();
		InterfaceB interfaceB = new IimplementationC();
		InterfaceC interfaceC = new IimplementationC();
		
		interfaceA.methodA();
		interfaceB.methodB();
		interfaceC.methodA();
		interfaceC.methodB();
		interfaceC.methodC();
		
	}

}
