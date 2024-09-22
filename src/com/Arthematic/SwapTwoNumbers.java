package com.Arthematic;

public class SwapTwoNumbers {

	public static void main(String[] args) 
	{
		int a=5,b=10;
		System.out.println("Number Before Swapping: " +a+ " and " +b);
		a=a+b;
		b=a-b;
		a=a-b;	
		System.out.println("Number Before Swapping: " +a+ " and " +b);
	}
}
