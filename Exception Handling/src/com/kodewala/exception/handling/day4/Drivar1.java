package com.kodewala.exception.handling.day4;

public class Drivar1 {

	public static void main(String[] args) {




				try
				{
					System.out.println("Try Start.....");


					
					String name = args[0]; // this code may throw exception...
					//System.out.println(name);

					System.out.println("Driver.main()---try end----");
				}
				catch (ArrayIndexOutOfBoundsException e)
				{
					//e.printStackTrace();
					System.err.println("Name is not provided...");
				}
				catch (Exception e)
				{
					e .printStackTrace();
					System.out.println("some other problem");
					
				}

			}

		}


	


