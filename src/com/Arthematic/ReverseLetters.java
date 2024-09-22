package com.Arthematic;

public class ReverseLetters {

	public static void main(String[] args) 
	{
		String name="Veena";
		String text="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			char letter=name.charAt(i);
			text=text+letter;
		}
		System.out.println("Reverse name is: " +text);
	}
}
