package com.mycompany.study.ch06.trgugu;

public class TrGugu {

	public static void gugu(int x) {
		for(int i=1; i<10; i++) {
			int num = x*i;
			System.out.println(x+" * "+i+" = "+num);
		}
		
	}
	
	public static boolean gugudan(int x) {
		boolean f;
		if(x == 0) {
			f = false;
			
		}else {
			f = true;
			for(int i=1; i<10; i++) {
				int num = x*i;
				System.out.println(x+" * "+i+" = "+num);
			}
		}
		return f;
	}
	
}
