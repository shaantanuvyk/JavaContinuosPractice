package com.Arthematic;

import java.util.Date;

public class PyramidOfNumbers 
{
	
	public static void main(String[] args) 
	{
		int rows, columns, trianglelength=5; 
		int result=0; 
		int numberprovided=2;
		
		for(rows=1; rows<=trianglelength; rows++)
		{
			
			for(columns=1; columns<=rows; columns++)
			{
				result=result+numberprovided;
				System.out.print(" " +result);
			}
			System.out.println();
		}
	}
}
