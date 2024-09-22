package com.Arthematic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MinMaxValuefromArray 
{
	int[] arr = new int[]{11,8,7,5,20,9,3,1,55,99,0,-15,200};
	public static void main(String[] args) 
	{
		MinMaxValuefromArray mmva = new MinMaxValuefromArray();
		mmva.maxNumberinArray();
		mmva.minNumberinArray();
	}
	
	public void maxNumberinArray()
	{
		int max = arr[0];
		System.out.println("length of an array: " +arr.length);
		for(int i=1; i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max= arr[i];
			}
		}
		System.out.println("Max number is: " +max);
	}
	
	public void minNumberinArray()
	{
		int min=arr[0];
		for(int i=1; i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Min number is: " +min);
	}
}