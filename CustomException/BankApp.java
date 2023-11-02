package com.kn.CustomException;

import java.util.Scanner;

public class BankApp
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double accountBalance=25000;
		System.out.println("Enter the Amount to Withdrawl = ");
		double amount=sc.nextDouble();
		try {
		wihdrawlAmount(amount,accountBalance);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled..");
			e.printStackTrace();
		}
		sc.close();
	}

	private static void wihdrawlAmount(double amount, double accountBalance) throws Exception
	{
		if(amount<=accountBalance)
		{
			System.out.println("Transaction successful..");
		}
		else
		{
			System.out.println("Entered amount is greater than the Account Balance..");
			throw new Transaction("Transaction failed...");
		}
	}
}
