package com.kn.Tasks;

import java.util.Scanner;

public class CalculatorApp
{
	public static void main(String[] args)
	{
		System.out.println("Calculator started using");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number = ");
		int first=sc.nextInt();
		System.out.println("Enter the second number =   ");
		int second=sc.nextInt();
		add(first,second);
		System.out.println("Calculator Ended");
		sc.close();
	}

	private static void add(int first, int second)
	{
		System.out.println("Addition started");
		int sum=first+second;
		System.out.println("sum = "+sum);
		sub(first,second);
		System.out.println("Addition has ended");
	}

	private static void sub(int first, int second) 
	{
		System.out.println("subtraction started");
		int dif=first-second;
		System.out.println("difference = "+dif);
		try {
		mul(first,second);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled : value must not be zero..");
		}
		System.out.println("subtraction has ended");
	}

	private static void mul(int first, int second) throws ArithmeticException
	{
		System.out.println("Multiplication started");
		int product=first*second;
		System.out.println("product = "+product);
		div(first,second);
		System.out.println("Multiplication has ended");
	}

	private static void div(int first, int second) throws ArithmeticException
	{
		System.out.println("Division started");
		int div=0;
		try {
			div=first/second;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled : Values must not be zero ");
			System.out.println("Division = "+div);
			throw e;
		}
		System.out.println("Division has ended");
	}
}
