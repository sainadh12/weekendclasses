package com.test.daythree;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap <String, Integer> hashMap = new HashMap<String, Integer>();
		
		hashMap.put("Kansas:", new Integer(130000));
		hashMap.put("Arizona:", new Integer(176000));
		hashMap.put("Chicago:", new Integer(1560000));
		hashMap.put("Dallas:", new Integer(1350000));
		hashMap.put("Texas:", new Integer(11120000));
		hashMap.put("Florida:", new Integer(1450000));
		
		System.out.println(hashMap);
		
		for(Map.Entry map : hashMap.entrySet())
			System.out.println(map.getKey()+" "+map.getValue());
		
		hashMap.remove("Kansas:");
		
		System.out.println("\n After removing one Key \n");
		
		for(Map.Entry map : hashMap.entrySet())
			System.out.println(map.getKey()+" "+map.getValue());
		
		hashMap.replace("Texas:", 120000);
		
		System.out.println("\n After updating the Texas population value \n");
		for(Map.Entry map : hashMap.entrySet())
			System.out.println(map.getKey()+" "+map.getValue());
	}
}