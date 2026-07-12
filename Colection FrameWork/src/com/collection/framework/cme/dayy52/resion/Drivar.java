package com.collection.framework.cme.dayy52.resion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Drivar {

	public static void main(String[] args) {
		
		Map<String, String>name = new HashMap<String, String>();
		
		name.put("Maharashtra", "Mumbai");
		name.put("UttarPradesh", "Lucknow");
		name.put("Bihar", "Patna");
		name.put("Jharkand", "Ranchi");
		
		Map<String, String>list = Collections.synchronizedMap(name);
		
		list.put("Varanasi", "Jaunpur");
		System.out.println(list);
		
		Map<String, String>list1 =new ConcurrentHashMap<String, String>(100);
		
		list1.put("Manohn", "Singh");
		list1.put("Suraj", "singh");
		
		System.out.println(list1);
		
		
			}
		}
		
		
		
	


