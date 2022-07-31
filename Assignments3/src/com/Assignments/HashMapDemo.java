package com.Assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,String> s1=new HashMap();
		s1.put("telangana", "hyderabad");
		s1.put("andhra pradesh", "amaravathi");
		s1.put("assum", "dispur");
		s1.put("bihar", "patna");
		s1.put("goa", "panaji");
		s1.put("chhattisgard", "naya raipur");
		System.out.println(s1.containsKey("goa"));
		System.out.println(s1.containsValue("partna"));
		Iterator<Map.Entry<String, String>> itr = s1.entrySet().iterator();
        
        while(itr.hasNext())
        {
             Map.Entry<String, String> entry = itr.next();
             System.out.println("Key = " + entry.getKey() + 
                                 ", Value = " + entry.getValue());
        }
		
		
		

	}

}
