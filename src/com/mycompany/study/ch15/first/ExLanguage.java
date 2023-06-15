package com.mycompany.study.ch15.first;

import java.util.ArrayList;
import java.util.List;

public class ExLanguage {

	public static void main(String[] args) {
		
		ArrayList<Language> arraylist = new ArrayList<Language>();
		
		for(Language language: arraylist) {
			System.out.println("language.name: "+language.name);
			System.out.println("language.version: "+language.version);
		}
		
//		arraylist.add("JAVA");		Language  객체를 넣어 주어야 되서 오류
//		arraylist.add("11");
		
		Language language = new Language("JAVA", 11);
		
		
		arraylist.add(language);
		arraylist.add(new Language("Phthon", 8));
		arraylist.add(new Language("C#", 6));
		
		
		for(Language a: arraylist) {
			System.out.println("language.name: "+a.name);
			System.out.println("language.version: "+a.version);
		}
		
//		List<String> list = new ArrayList<String>();
//		
//		list.add("JAVA");
//		list.add("Python");
//		list.add("Node");
//		list.add(2,"C#");
//		
////		for(int i=0; i<list.size();i++) {
////			System.out.println("list.get("+i+") : "+list.get(i)); 
////		}
//		
////		System.out.println("===============");
//		int i = 0;
//		for(String a:list) {
//			//String a = list[i];
//			System.out.println(i+" : "+a);
//			i++;
//		}
//		System.out.println("===============");
//		list.remove(2);
//		list.remove("Python");
//		int j = 0;
//		for(String a:list) {
//			//String a = list[j];
//			System.out.println(j+" : "+a);
//			j++;
//		}
		
//		ArrayList<String> arraylist = new ArrayList<String>();
//		
//		arraylist.add("JAVA");
//		arraylist.add("Python");
//		arraylist.add("Node");
//		arraylist.add(2,"C#");
//		
//		for(int i=0; i<arraylist.size();i++) {
//			System.out.println("arraylist.get("+i+") : "+arraylist.get(i)); 
//		}
//		
//		System.out.println("===============");
//		int i = 0;
//		for(String a:arraylist) {
//			//String a = arraylist[i];
//			System.out.println(i+" : "+a);
//			i++;
//		}
		
	}
	
	

}
