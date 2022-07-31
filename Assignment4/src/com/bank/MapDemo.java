package com.bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String,Integer> h1=new HashMap();
		h1.put("divya", 1657576);
		h1.put("sravya",541476);
		h1.put("abc",8709080);
		h1.put("srinivas", 656156);
		h1.put("vasavi",53431747);
		System.out.println(h1);
		System.out.println(h1.containsKey("divya"));
		System.out.println(h1.containsValue(1657576));
		 for (Entry<String, Integer> entry : h1.entrySet()) 
	            System.out.println("Key = " + entry.getKey() +
	                             ", Value = " + entry.getValue());

	}

}
