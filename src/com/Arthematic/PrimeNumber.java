package com.Arthematic;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int number=21;
		int temp=0;
		for(int i=4;i<number;i++)
		{
			if(number%2==0||number%3==0)
			{
				temp=temp+1;
				break;
			}
		}
		if(temp==1)
		{
			System.out.println(number+ " is a Not a Prime Number");
		}
		else if(number==2||number==3)
		{
			System.out.println(number+ " is a Prime Number");
		}
		else
		{
			System.out.println(number+ " is a Prime Number");
		}
	}
}
