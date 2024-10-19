package com.Inheritance;

public class SimpleInheritance
{
	static int a = 3;
	static int b = 6;
	public static class S1
	{
		public int addition()
		{
			int add = a+b;
			System.out.println("Addition is: " +add);
			return add;
		}
	}
	
	public static class S2 extends S1
	{
		public int substraction()
		{
			int sub = super.addition()-a;
			System.out.println("Subtraction is: " +sub);
			return sub;
		}
	}
}