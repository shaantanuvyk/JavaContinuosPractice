package com.Inheritance;

public class HierarchicalInheritance 
{
	public static class H1
	{
		public int div()
		{
			int div=11/10;
			System.out.println("Division is: " +div);
			return div;
		}
	}
	
	public static class H2 extends H1
	{
		public int rem()
		{
			int rem=32%6+div();
			System.out.println("Remainder is: " +rem);
			return rem;
		}
	}
	
	public static class H3 extends H1
	{
		public int square()
		{
			int square=2*2+div();
			System.out.println("Square is: " +square);
			return square;
		}
	}
}