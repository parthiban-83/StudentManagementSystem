package com.springboot.StudentManagementSystem.Exception;

public class ResourceNotFoundException extends RuntimeException
{
	private String message;
	public ResourceNotFoundException(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}
}
