package com.javacode;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] productNames = {
	    "NovaPhone X1",
	    "Galaxy Z12",
	    "PixelPro 9",
	    "AeroPhone 16",
	    null,
	    "Titan X5",
	    "NexaPhone 7",
	    "UltraMax 12",
	    "ZenPhone 11",
	    "Orion X20",
	    null,
	    "FusionPhone 8",
	    "AlphaTech 14",
	    "CorePhone 6",
	    "Quantum X3",
	    "VibePhone 10",
	    null,
	    "HyperX Mobile 15",
	    "EchoPhone 13",
	    "Infinity X9",
	    "PrismPhone 4",
	    "BoltPhone 18",
	    null,
	    "EdgeTech 21"
	};
for (int i = 1; i <productNames.length; i++) {
	
	String currentProduct = productNames[i];
	
	if(currentProduct == null)
	{
		continue; // skip the current iteration
	}
	
	System.out.println(currentProduct.toUpperCase());
	
	}

}

}