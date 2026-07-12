package com.javacode;
/*public class Array{
	public static void main(String [] args) {
		int [] arr = {10,20,30,40};
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

public class Array{
	public static void main(String [] args) {
		int [] arr = {10,20,30,40};
		
		for (int x : arr) {
			System.out.println(x);
		}
	}
}
public class Array {
	public static void main(String [] args) {
		int [] arr = {10,20,30,50};
		
		System.out.println(arr.length);
	}
}
*/
// 124 same output

import java.util.*;

/*public class Array{
	public static void main (String [] args) {
		int [] arr = {20,10,30,60};
		
		//convert array readable string
		//System.out.print(Arrays.toString(arr));
		// arr of number
		//System.out.println(arr.length);
		//ascending order
		//Arrays.sort(arr);
		//search element sort array
		//System.out.println(Arrays.toString(arr));
		//search element sorted array
		//int index = Arrays.binarySearch(arr,30);
		//System.out.println(index);
		
	}
}

public class Array {
	public static void main(String[]args) {
		int [] a = {1,2,3};
		int [] b = {1,2,3};
		System.out.println(Arrays.equals(a,b));
}
}

public class Array{
	public static void main(String[]args) {
		int[] arr = new int[5];
		
		Arrays.fill(arr,100);
		
		System.out.println(Arrays.toString(arr));
	}
}

public class Array{
	public static void main(String[] args) {
		int [] arr = {10,20,30,40};
		
		int [] copy = Arrays.copyOf(arr,5);
		
		System.out.println(Arrays.toString(copy));
	}
}

public class Array{
	public static void main(String[]args) {
		int[]arr = {10,30,40,60};
		
		int[] part = Arrays.copyOfRange(arr,1, 4);
		
		System.out.println(Arrays.toString(part));
	}
}

public class Array{
	public static void main(String[]args) {
		int[]arr= {10,40,50,60,70};
		
		int sum = 0;
		
		for (int i=0; i<arr.length;i++) {
		 sum = sum+arr [i];
	}
	System.out.println("Sum : "+sum);
}
}

public class Array{
	public static void main(String [] args) {
		int[]arr= {20,40,60,70,80};
		
		int min = arr [0];
		
		for(int i = 1; i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Largest = "+min);
	}
}

public class Array{
	public static void main (String[] args) {
		int [] arr = {10,20,50,70,40,};
		
		for(int i=0;i<arr.length;i++) {
			
			int temp = arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}

public class Array{
	public static void main (String [] args) {
		int [] arr = {11,40,60,71,40};
		
		int even = 0, odd = 0;
		
		for (int i = 0; i<arr.length;i++) {
			if (arr[i] %2 == 0)
				even++;
			else
				odd++;
		}
		System.out.println("Even : "+even);
		System.out.println("Odd : "+odd);
	}
}
public class Array{
	public static void main(String [] args) {
		int [] arr1 = {10,40,50,70};
		int [] arr2 = new int [arr1.length];
		
		for (int i=0; i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		System.out.println(Arrays.toString(arr2));
}
}

public class Array{
	public static void main(String[]args) {
		int[][]arr = {
				{1,2,3},
				{4,5,6}
		};
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j] +"");
			}
			System.out.println();
		}
}
}
            // tricky questions

public class Array {
	public static void main (String [] args) {
		int [] arr = new int [3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[3]);
	}
}

public class Array {
	public static void main (String [] args) {
		int [] arr = {20,40,60};
		System.out.println(Arrays.toString(arr));
	}
}

public class Array {
	public static void main(String [] args) {
		int [] arr = {30,40,60,80};
		System.out.println(arr.length);
	}
}

public class Array {
	public static void main (String [] args) {
	int [] arr = new int [5];
	System.out.println(arr[5]);
	}
}

public class Array {
	public static void main (String [] args) {
		int [] arr = {40,70,60};
		for (int x:arr) {
			x= x+5;
		}
		System.out.println(java.util.Arrays.toString(arr));
	}
}

public class Array {
	public static void main (String[]args) {
		int [] a = {1,2,3};
		int [] b = a;
		b[0] =100;
		System.out.println(a[0]);
	}
}

public class Array {
	public static void main (String []args) {
		int [] arr = {30,50,8};
		System.out.println(arr[arr.length-1]);
	}
}

public class Array{
	public static void main(String []args) {
		int [] [] arr = {
				{1,2,3},
				{4,5,6}
		};
		
		for(int i = 0; i<arr.length; i++) {
			for (int j = 0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]+"");
			}
			System.out.println();
		}
	}
}
*/
public class Array{
	public static void main (String[]args) {
		
	
String a=new String("Bengalore") +"vnfghgh"+ "Kodewala"; 

String b=new String("Bengalore" + "Kodewala");

String c=new String("Bengalore") + ("Kodewala");

 String d=new String(("Bengalore") + ("Kodewala"));

 String s = "ggfsbb" +"gfdfdf";

 
 System.out.println(a); 
 System.out.println(b); 
 System.out.println(c); 
 System.out.println(d); 
 System.out.println(s); 
	}
}