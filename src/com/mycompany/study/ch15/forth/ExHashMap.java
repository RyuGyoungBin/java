package com.mycompany.study.ch15.forth;

import java.util.HashMap;
import java.util.Map;

public class ExHashMap {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();		// standard
		Map<String, String> map2 = new HashMap<>();
		
		HashMap<String, Integer> hashmap = new HashMap<>();				// not bad
		
		map.put("장원영", 100);
		map.put("전지현", 99);
		map.put("장동건", 98);
		
		map.clear();
		map.remove("장동건");
		
		
//		System.out.println("map.get(\"장원영\") : "+map.get("장원영"));
		
		for(String hashkey:map.keySet()) {
			Integer hashVal = map.get(hashkey);
			System.out.println(hashkey+":"+hashVal);
		}
		
//		map2.put("장원영","100");
	}
}
