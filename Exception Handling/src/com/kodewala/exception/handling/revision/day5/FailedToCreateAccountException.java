package com.kodewala.exception.handling.revision.day5;



public class FailedToCreateAccountException extends RuntimeException
{

	FailedToCreateAccountException(String msg)
	{
		super(msg);
	}
}
