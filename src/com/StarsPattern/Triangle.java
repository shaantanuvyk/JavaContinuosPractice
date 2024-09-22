package com.StarsPattern;

public class Triangle 
{
	int count=5;
	int column, row;
	public static void main(String[] args) 
	{
		Triangle t = new Triangle();
//		t.righttriangle();
//		t.reverserighttriangle();
//		t.lefttriangle();
//		t.reverselefttriangle();
//		t.reverseequilateraltriangel();
//		t.equilateraltriangel();
		t.Kseriesstars();
		t.reverseKseriesstars();
	}
	
	public void righttriangle()
	{
		for(row=1; row<=count; row++)
		{
			for(column=1; column<=row;column++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void lefttriangle()
	{
		for(row=1; row<=count; row++)
		{
			for(column=row; column<count; column++)
			{
				System.out.print(" ");
			}
			for(int star=1; star<=row; star++) 
			{	  
				System.out.print("*"); 
			}
			System.out.println("");
		}
	}

	public void reverserighttriangle()
	{
		for(row=1; row<=count; row++)
		{
			for(column=row; column<=count; column++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void reverselefttriangle()
	{
		for (row=1; row<=count;row++)
		{
			for(int star=row; star<=count;star++)
			{
				System.out.print("*");
			}
			System.out.println();
			for(column=0; column<row; column++)
			{
				System.out.print(" ");
			}
		}
	}

	public void equilateraltriangel()
	{
		for(row=1;row<=count;row++)
		{
			for(column=row;column<count;column++)
			{
				System.out.print(" ");
			}
			for(int star=0;star<row;star++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void reverseequilateraltriangel()
	{
		for(row=1;row<=count;row++)
		{
			for(int star=row;star<count;star++)
			{
				System.out.print("* ");
			}
			System.out.println(); 
			for(column=0;column<row;column++) 
			{
				System.out.print(" "); 
			}
		}
	}
	
	public void Kseriesstars()
	{
		for(row=1;row<=count;row++)
		{
			for(int star=row;star<=count;star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int row2=2;row2<=count;row2++)
		{
			for(int column2=1;column2<=row2;column2++)
			{
				System.out.print("*");
			}	
			System.out.println();
		}
	}

	public void reverseKseriesstars()
	{
		for(row=1;row<=count;row++)
		{
			for(column=1;column<row;column++)
			{
				System.out.print(" ");
			}
			for(int star=row; star<=count; star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int row2=2;row2<=count;row2++)
		{
			for(int column2=row2;column2<count;column2++)
			{
				System.out.print(" ");
			}
			
			for(int star2=0;star2<row2;star2++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void emptytriangle()
	{
		
	}
}
