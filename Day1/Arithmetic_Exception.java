package com.kn.Day1;

import java.util.Scanner;

public class Arithmetic_Exception 
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Exceptions");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Numerator = ");
		int n=sc.nextInt();
		System.out.print("Enter the Denominator = ");
		int d=sc.nextInt();
		double div=0;
		try {
			div=n/d;
		}catch(ArithmeticException ae){
			System.out.println("Infinite");
		}
		System.out.println("Division = "+div);
		System.out.println("Thannk you");
		sc.close();
	}
}
