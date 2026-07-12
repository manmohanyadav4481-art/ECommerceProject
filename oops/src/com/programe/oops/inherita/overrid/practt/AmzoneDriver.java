package com.programe.oops.inherita.overrid.practt;

public class AmzoneDriver {
public static void main (String[]args) {
	DeliveryService d = new Amazon ();
	
	Delivery de = d.delivery();
	
	System.out.println(de.status);
}
}
