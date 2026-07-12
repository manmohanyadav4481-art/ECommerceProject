package com.Arraylist.Revision.b;
import java.util.ArrayList;
import java.util.Collections;
public class Main4 {

	public static void main(String[] args) {
		
		ArrayList<Integer>list =new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		Collections.shuffle(list);
		
       System.out.println(list);
	}

}
