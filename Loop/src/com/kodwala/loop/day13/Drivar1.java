package com.kodwala.loop.day13;

public class Drivar1 {

	public static void main(String[] args) {

		String [] products = { "iPhone 16", "Samsung Galaxy S25", null, "Google Pixel 10","MacBook Air M4",
"Dell XPS 15","HP Pavilion Laptop", "Lenovo ThinkPad X1" ,null ,"Apple Watch Series 12", "Samsung Galaxy Watch 8",
"Sony WH-1000XM6 Headphones", null ,"JBL Flip 8 Speaker", null ,"iPad Pro 13", null ,"Amazon Kindle Paperwhite","Canon EOS R10 Camera",
"Nikon Z50 Camera", null ,"Logitech MX Master 4 Mouse", null ,"Asus ROG Gaming Laptop","PlayStation 6 Console","Xbox Series Z"
};

		for(int index=0; index<products.length; index++)
		{
			String currentProduct= products [index];
			
			if(currentProduct == null || currentProduct.startsWith("iPhone 16")) // skip the current iteration  [iPhone 16]
			{
				continue;
			}
			
			// biz logic
			
			System.out.println(currentProduct.toUpperCase());
		}

	}

}
