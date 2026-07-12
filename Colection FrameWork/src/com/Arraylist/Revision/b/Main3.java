package com.Arraylist.Revision.b;
import java .util.ArrayList;
import java .util.Collections;
public class Main3 {

	public static void main(String[] args) {
		
		ArrayList<String>list =new ArrayList<>();

		list.add("jav");
		list.add("man");
		list.add("ma");
		
		Collections.reverse(list);
		
		System.out.println(list);
	}

}
