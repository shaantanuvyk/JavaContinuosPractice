package com.Arthematic;

import java.util.ArrayList;

public class FibonaaciSeries {

	public static void main(String[] args) 
	{
		int numbers = 10;
		int firstNumber=0, secondNumber=1, tempNumber=0;
		ArrayList<Integer> series = new ArrayList<Integer>();
		while(numbers>0)
		{
			tempNumber=firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=tempNumber;
			numbers--;
			series.add(tempNumber);
			
		}
		System.out.println("Fibonaaci Series is: " +series);
	}
}
