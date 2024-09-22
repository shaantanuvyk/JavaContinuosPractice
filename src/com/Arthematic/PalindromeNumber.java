package com.Arthematic;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
		int number=1122322115, reverse=0, temp=number, remainder;
		
		while(temp>0)
		{
			remainder = temp%10;
			reverse = reverse * 10 + remainder;
			temp = temp/10;
		}
		if(reverse == number)
		{
			System.out.println(number + " is a Palindrome Number");
		}
		else
		{
			System.out.println(number + " is NOT a Palindrome Number");
		}
	}
}
