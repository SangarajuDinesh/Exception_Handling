package com.kn.Tasks;

import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first data = ");
		int a=sc.nextInt();
		System.out.print("Enter the Second data = ");
		int b=sc.nextInt();
		add(a,b);
		sc.close();
	}

	private static void add(int a, int b)
	{
		System.out.println("Addition has started..");
		int sum=a+b;
		System.out.println(sum);
		try {
			sub(a,b);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled.");
		}
		System.out.println("addition has ended..");
		
	}

	private static void sub(int a, int b) throws Exception 
	{
		System.out.println("Substraction has started..");
		int sub=a-b;
		System.out.println(sub);
		try {
			mul(a,b);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
			throw e;
		}
		System.out.println("Substraction has ended..");
	}

	private static void mul(int a, int b) throws Exception
	{
		System.out.println("Multiplication has stsrted..");
		int product=a*b;
		System.out.println(product);
		try {
			div(a,b);
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
			throw e;
		}
		System.out.println("Multiplication has ended..");
	}

	private static void div(int a, int b) throws ArithmeticException
	{
		System.out.println("Division has started..");
		int div=0;
		try {
			div=a/b;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exceptin handled");
			throw ae;
		}
		System.out.println(div);
		System.out.println("Division has ended..");
	}
}
