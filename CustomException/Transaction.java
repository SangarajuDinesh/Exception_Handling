package com.kn.CustomException;

public class Transaction extends Exception 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Transaction()
	{
		super();
	}
	public Transaction(String s)
	{
		super(s);
	}
}
