package com.kodewala.exception.handling.dayy4;

public class EmailAlreadyExistsException extends RuntimeException  
{
	EmailAlreadyExistsException(String _message)
		{
			super(_message);
		}
	}

