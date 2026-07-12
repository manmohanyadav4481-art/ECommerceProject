package com.kodwala.loop.day13;

public class Drivar0 {

	public static void main(String[] args) {

		String product [] = {"iPhone 16", "Samsung Galaxy S25","Google Pixel 10","MacBook Air M4",
				"Dell XPS 15","HP Pavilion Laptop", "Lenovo ThinkPad X1" ,"Apple Watch Series 12", "Samsung Galaxy Watch 8",
				"Sony WH-1000XM6 Headphones","JBL Flip 8 Speaker","iPad Pro 13","Amazon Kindle Paperwhite","Canon EOS R10 Camera",
				"Nikon Z50 Camera","Logitech MX Master 4 Mouse","Asus ROG Gaming Laptop","PlayStation 6 Console","Xbox Series Z" };
		
		for(int index =0; index<product.length; index++)
		{
			String element = product[index];
			
			if(element.equals("Google Pixel 10"))
			{
				continue;
			}
			
			System.out.println(element.toLowerCase());
		}


	}

}
