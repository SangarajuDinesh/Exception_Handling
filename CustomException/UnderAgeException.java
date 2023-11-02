package com.kn.CustomException;

public class UnderAgeException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public UnderAgeException()
	{
		super();
	}
	public UnderAgeException(String s)
	{
		super(s);
	}
}
