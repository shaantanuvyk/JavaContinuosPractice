package com.Arthematic;

public class CompareHighestAndLowestNumber {

	public static void main(String[] args) 
	{

		int firstNumber = 4;
		int secondNumber = 45;

		if (firstNumber > secondNumber) 
		{
			System.out.println(firstNumber + " is greater than " + secondNumber);
		} 
		else if (firstNumber == secondNumber) 
		{
			System.out.println(firstNumber + " is equal to " + secondNumber);
		} 
		else 
		{
			System.out.println(secondNumber + " is lower than " + firstNumber);
		}
	}
}
