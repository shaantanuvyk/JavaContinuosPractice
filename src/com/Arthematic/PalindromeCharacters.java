package com.Arthematic;

public class PalindromeCharacters {

	public static void main(String[] args) 
	{
		String text = "levels";
		String temp=text, result="";
		
		for(int i=temp.length()-1; i>=0; i--)
		{
			char letter = temp.charAt(i);
			result = result+letter;
		}
		if(text.equals(result))
		{
			System.out.println("Given text is a Palindrome text " +result);
		}
		else
		{
			System.out.println("Given text is NOT Palindrome text " +result);
		}
	}
}
