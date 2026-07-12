package com.Arraylist.Revision;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main3 {

	public static void main(String[] args) {

		ArrayList<String>list = new ArrayList<>();
		
		list.add("Java");
		list.add("Python");
		list.add("jdbc");
		list.add("c++");
		list.add("Spring boot");
		
		Iterator<String>itr =list.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
	

	}

	}
}
