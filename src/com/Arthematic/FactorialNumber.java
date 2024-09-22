package com.Arthematic;

public class FactorialNumber {

	public static void main(String[] args) 
	{
		int number = 5, i=1, factorial, result=1;
		
		while(number>0)
		{
			factorial = number * i; //4*3*2*1
			result = factorial*result;
			number--;
		}
		System.out.println("Factorial Number is: " +result);
	}
}

/*
int number=5;
for(int i=number-1; i>=1; i--)
{
	number=number*i;
}
System.out.println("Factorial is:" +number);
*/