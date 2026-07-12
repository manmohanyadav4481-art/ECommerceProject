package com.kodwala.loop.day13;

public class Drivar5 {

	public static void main(String[] args) {

		String coustomerdiscount = "Gold";
		
		switch (coustomerdiscount) {
		
		case "Gold" :
			System.out.println("10/ discount");
			break;
			
		case "silver" :
			System.out.println("no discount");
			break;
			
		case "platinum" :
			System.out.println("15/ discount");
			
		default:
			System.out.println("unkown data");
			break;
		}

	}

}
