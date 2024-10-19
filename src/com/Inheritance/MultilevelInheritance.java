package com.Inheritance;

public class MultilevelInheritance 
{	
	public static class M1
	{
		public int add()
		{
			int add=5+10;
			System.out.println("Addition is: " +add);
			return add;
		}
	}
	
	public static class M2 extends M1
	{
		public int sub()
		{
			int sub=15-3;
			System.out.println("Substraction is: " +sub);
			return sub;
		}
	}
	
	public static class M3 extends M2
	{
		public int mul()
		{
			int mul=10*3;
			System.out.println("Multiplication is: " +mul);
			return mul;
		}
	}
}