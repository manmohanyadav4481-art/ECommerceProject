package com.kodewala.exception.handling.day5;

public class FailedToCreateAccountException extends RuntimeException 
{

	public FailedToCreateAccountException(String msg)
	{
		super(msg);
	}
	

}
