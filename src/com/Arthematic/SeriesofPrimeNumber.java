package com.Arthematic;

import java.util.ArrayList;

public class SeriesofPrimeNumber {

	public static void main(String[] args) 
	{
		int number=23;
		
	//	2,3,5,7,11,13,23
		
		for(int i=4; i<=number; i++)
		{
			if(i%2==0||i%3==0)
			{
				System.out.println(i+ " is Not a Prime");
			}
			else
			{
				System.out.println(i+ " is a Prime----------------------------");
			}
		}
	}
}