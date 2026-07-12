package com.Arraylist.Revision.b;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Iterator;
public class Main {
	
	public static void main (String[]args) {
		
		ArrayList<String>list = new ArrayList<>();
		LinkedList<String>city = new LinkedList<>();
		Vector<Integer>v = new Vector<>();
		Stack<String>stack =new Stack<>();
		HashSet<Integer>set =new HashSet<>();
		LinkedHashSet<String>sett = new LinkedHashSet<>();
		TreeSet<Integer>man = new TreeSet<>();
		PriorityQueue<Integer>pq =new PriorityQueue<>();
		ArrayDeque<String>dq=new ArrayDeque<>();
		HashMap<Integer,String>map =new HashMap<>();
		LinkedHashMap<Integer,String>Map = new LinkedHashMap<>();
		TreeMap<Integer, String>mapp =new TreeMap<>();
		
		
		list.add("java");
		list.add("Python");
		list.add("c++");
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		list.remove(0);
		
		System.out.println(list);
		
		list.add(0, "Core java");
		
		System.out.println(list);
		
		Iterator<String>itr=list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----------------------------------------------");
		
		city.add("Lucknow");
		city.add("Kanpur");
		city.add("Varanasi");
		
		System.out.println(city);
		
		System.out.println(city.get(0));
		
		city.removeLast();
		System.out.println(city);
		
		city.add(0, "Agra");
		
		System.out.println(city);
		
		System.out.println("***********************************************");
		
		v.add(10);
		v.add(60);
		v.add(50);
		v.add(34);
		v.add(07);
		
		System.out.println(v);
		
		System.out.println(v.capacity());
		
		System.out.println("************************************************");
		
		stack.push("man");
		stack.push("sam");
		stack.push("nam");
		stack.push("manm");
		
		System.out.println(stack);
		
		stack.pop();
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		System.out.println("***********************************************");
		
		set.add(76);
		set.add(54);
		set.add(75);
		
		System.out.println(set);
		
		System.out.println("**************************************************");
		
		sett.add("java");
		sett.add("python");
		sett.add("man");
		
		System.out.println(sett);
		
		sett.add("am;n");
		
		System.out.println(sett);
		
		System.out.println("*************************************************");
		
		man.add(40);
		man.add(65);
		man.add(22);
		man.add(21);
		
		System.out.println(man);
		
		System.out.println("*************************************************");
		
		pq.add(80);
		pq.add(54);
		pq.add(76);
		pq.add(99);
		pq.add(11);
		pq.add(43);
		
		System.out.println(pq);
		
		pq.poll();
		
		System.out.println(pq);
		
		System.out.println("*******************************************");
		
		dq.add("A");
		dq.add("C");
		dq.add("man");
		
		dq.addFirst("Start");
		dq.addLast("End");
		System.out.println(dq);
		
		System.out.println("***********************************************");
		
		map.put(101, "manmohan");
		map.put(34, "man");
		
		System.out.println(map);
		
		System.out.println(map.get(34));
		
		Map.put(1, "raaj");
		Map.put(2, "ram");
		
		System.out.println(Map);
		
		System.out.println("****************************************************");
		
		mapp.put(3, "mram");
		mapp.put(1, "ram");
		mapp.put(4, "vijay");
		
		System.out.println(mapp);
		
		System.out.println("*************************************************");
		
		
	}

}
