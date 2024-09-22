package com.Arthematic;

public class SeriesOfEvenOdd {

	public static void main(String[] args) 
	{
		int number=3;
		for(int i=1; i<=number; i++)
		{
			if(i%2==0)
			{
				System.out.println("These Nos are Even: " +i);
			}
			else
			{
				System.out.println("These Nos. are Odd: " +i);
			}
		}
	}
}
