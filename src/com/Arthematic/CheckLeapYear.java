package com.Arthematic;

public class CheckLeapYear {

	public static void main(String[] args) 
	{
		int year = 2100;
		if (year <= 2024) 
		{
			if (year % 4 == 0) 
			{
				if(year % 400 ==0)
				{
					System.out.println(year + " was a leap year");
				}
			}
			else 
			{
				System.out.println(year + " was not a leap year");
			}
		}
		if (year > 2024) 
		{
			if (year % 4 == 0) 
			{
				if(year % 400 == 0)
				{
					System.out.println(year + " will be a leap year");
				}
			}
			else 
			{
				System.out.println(year + " won't be a leap year");
			}
		}
	}
}
