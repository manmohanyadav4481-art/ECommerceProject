package com.javacode;

/*public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			String s1 = "Mumbai";
			String s2 = "Mumbai";
			
			String s3 = new String("Delhi");
			String s4 = new String("Delhi");
			
			System.out.println(s1==s2);
			System.out.println(s3.equals(s4));


	}

}

public class Str{
	public static void main (String []args) {
		String n1 = "java";
		n1=n1.concat("Hello");
		System.out.println(n1);
	}
}

public class Str{
	public static void main(String [] args) {
		String s = "java";
		System.out.println(s.length());
	}
}

public class Str {
	public static void main (String []args) {
		String s = "java";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(2));
	}
}


public class Str{
	public static void main (String []args) {
		String s = "java";
		System.out.println(s.toUpperCase());
	}
}

public class Str{
	public static void main (String []args) {
		String s = "JAVA";
		System.out.println(s.toLowerCase());
	}
}

public class Str{
	public static void main (String [] args) {
		String s1 = "JAVA";
		String s2 = "JAVA";
		String s3 = "java";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}

public class Str {
	public static void main (String []args) {
		String s1 = "JAVA";
		String s2 = "java";
		
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}

public class Str {
	public static void main (String [] args) {
		String s1 = "Hello";
		String s2 = "JAVA";
		
		String result = s1.concat(s2);
		System.out.println(result);
	}
}

public class Str{
	public static void main (String [] args) {
		String firstname = "Manmohan";
		String lastname = "Yadav";
		
		System.out.println(firstname +lastname);
	}
}

public class Str{
	public static void main (String [] args) {
		String s = "I Love Java";
		
		System.out.println(s.contains("Java"));
		System.out.println(s.contains("Python"));
	}
}

public class Str{
	public static void main(String [] args) {
		String s = "Programming";
		
		System.out.println(s.startsWith("Prog"));
		System.out.println(s.endsWith("ing"));
	}
}

public class Str{
	public static void main(String [] args) {
		String s = "JAVA";
		
		System.out.println(s.indexOf("J"));
		System.out.print(s.indexOf("V"));
	}
}

public class Str{
	public static void main(String [] args) {
		String s = "JAVA";
		System.out.println(s.replace('A', 'O'));
	}
}

public class Str{
	public static void main (String [] args) {
		String s = "Java";
		System.out.println(s.trim());
	}
}

public class Str{
	public static void main (String [] args) {
		String s1 = "";
		String s2 = "Java";
		
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
	}
}

public class Str {
	public static void main(String [] args) {
		String s1 = "Apple";
		String s2 = "Banana";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s1));
		System.out.println(s1.compareTo("Apple"));
	}
}

public class Str{
	public static void main (String [] args) {
		String s = "Java Programming";
		
		System.out.println("Original String : "+s);
		System.out.println("Length : "+s.length());
		System.out.println("Character at index 2: "+s.charAt(2));
		System.out.println("Uppercase : "+s.toUpperCase());
		System.out.println("Lowercase : "+s.toLowerCase());
		System.out.println("Contains Java : "+ s.contains("Java"));
		System.out.println("Starts with java : "+s.startsWith("Java"));
		System.out.println("Ends with ing : "+s.endsWith("ing"));
		System.out.println("Substring : "+s.substring(5));
		System.out.println("Replace : "+s.replace("Java", "Python"));
	}
}

public class Str{
	public static void main (String [] args) {
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String ("Java");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}
}

public class Str {
	public static void main (String [] args) {
		String s1 = "Java";
		String s2 = new String ("Java");
		
		System.out.println(s1.equals(s2));
	}
}

public class Str{
	public static void main (String [] args) {
		String s = "Hello";
		s.concat("World");
		System.out.println(s);
	}
}


public class Str{
	public static void main(String [] args) {
		String s1 = "Java";//scp1
		String s2 = "Java";//scp2
		String s3 = new String ("Java");//scp3+heap
		String s4 = s1.concat("Python ");//scp4+heap
		s1.concat("Python");//scp5
		String s6 = "Java"+"Python"+"Springboot";
		String s7 = "Ram";
		String s8 = "Shyam";
		String s9 = s7+s8;
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s4);
		System.out.println(s1);
		System.out.println(s6);
		System.out.println(s9);
	}
}
/*
public class Str{
	public static void main (String [] args) {
		String s = "Java";
		System.out.println(s.charAt(1));
		System.out.println(s.length());
	}
}

public class Str{
	public static void main (String [] args) {
		String s = "Programming";
		System.out.println(s.substring(3,7));
	}
}

public class Str {
	public static void main (String [] args) {
		//String s = "Backend";
		String s1 = "java";
		System.out.println(s1.substring(2
				));
	}
}

public class Str{
	public static void main(String [] args) {
		String s = "java";
		String s1 = "Java";
		String s2 ="man";
		String s3 = "manmohan";
		String s4 = "Yadav";
		String s5 = "Priman i love you";
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(3));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		String result = s.concat(s2);
		System.out.println(result);
		System.out.println(s3+s4);
		System.out.println(s5.contains("Priman"));
		System.out.println(s5.startsWith("Priman"));
		System.out.println(s5.endsWith("you"));
		System.out.println(s3.substring(0,4));
		System.out.println(s3.substring(3));
		System.out.println(s4.indexOf('Y'));
		System.out.println(s3.replace('m', 'n'));
		System.out.println(s.trim());
		System.out.println(s.compareTo(s3));
		System.out.println(s.compareTo(s4));
		System.out.println(s.compareTo("java"));
	}
}

final class Name
{
	
	
}

public class Str extends Name
{
	public static void main(String[] args) 
	
	{
		String s1 = "Manmohan" + "Yadav";//scp
	
		String s2 = "Manmohan";
		String s3 = "Singh";
		
		String s4 = s2+s3;//s4? --> heap --> "Manmohan singh" 
		
		String s5 = s4.intern();//copy object from heap to scp.
		
		System.out.println(s4==s5);//true(scp)
	}
}
*/
public class Str{
	public static void main(String [] args) {
		Str sb = new Str ("hello");
		sb.append("World");
		System.out.println(sb);
	}
}