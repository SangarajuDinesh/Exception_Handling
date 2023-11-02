package com.kn.CustomException;

import java.util.Scanner;

public class DrivingLicence
{
	public static void main(String[] args)
	{
		System.out.println("Driving licence scenario started..");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age = ");
		int age=sc.nextInt();
		try {
			drivingLicence(age);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Licence issued based on age scenario");
		sc.close();
	}

	public static void drivingLicence(int age) throws Exception
	{
		System.out.println("Driving license mathod has started..");
		if(age>=18 && age<=65)
		{
			System.out.println("Congratulations... Licence issued");
		}
		else if(age<18)
		{
			throw new UnderAgeException("You are under age...");
		}
		else if(age>65)
		{
			throw new OverAgeException("You are not eligible for license");
		}
	}
}
