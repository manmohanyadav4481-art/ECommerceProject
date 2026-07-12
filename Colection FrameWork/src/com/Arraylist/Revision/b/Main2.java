package com.Arraylist.Revision.b;

import java.util.ArrayList;
import java.util.Collections;

public class Main2 {

	public static void main(String[] args) {
		
		ArrayList<Integer>list = new ArrayList<>();
		
		list.add(87);
		list.add(10);
		list.add(55);
		
		Collections.sort(list);
		
		System.out.println(list);

	}

}
