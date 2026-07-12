package com.javacode;

/*
public class StringBufferDem{
	public static void main(String[]args) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World");
		sb.insert(5, " Java");
		sb.replace(0, 5, "Hi");
		sb.delete(0, 2);
		sb.deleteCharAt(1);
		sb.reverse();
		sb.setCharAt(0, 'H');
		sb.ensureCapacity(100);
		sb.trimToSize();
		sb.setLength(3);
		System.out.println(sb.substring(1,4));
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(2));
		System.out.println(sb);
	}
}

*/
public class StringBufferDem{
	public static void main (String[]args) {

StringBuffer sb1 = new StringBuffer("Java");
StringBuffer sb2 = new StringBuffer("Java");
StringBuffer sb = new StringBuffer("Hello World");
sb.setLength(5);
System.out.println(sb);

StringBuffer sb3 = new StringBuffer();
for(int i=1; i<=5;i++){
	sb3.append(i);
}
System.out.println(sb3);

System.out.println(sb1.equals(sb2));
}
}