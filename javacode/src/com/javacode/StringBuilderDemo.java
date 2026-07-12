package com.javacode;
public class StringBuilderDemo{
	public static void main(String[]args) {
		StringBuilder sb = new StringBuilder("Java");
		sb.append("  Programming");
		sb.insert(5, " Python");
		sb.replace(0, 5, "Hi");
		sb.delete(1, 2);
		sb.reverse();
		sb.setCharAt(0, 'H');
		sb.deleteCharAt(2);
		sb.ensureCapacity(100);
		sb.trimToSize();
		sb.setLength(4);
		String str = sb.toString();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.charAt(1));
		System.out.println(sb.substring(1,4));
		System.out.println(sb);
	}
}
