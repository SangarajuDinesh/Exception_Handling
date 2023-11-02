package com.kn.CustomException;

public class OverAgeException extends Exception 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public OverAgeException()
	{
		super();
	}
	public OverAgeException(String s)
	{
		super(s);
	}
}
