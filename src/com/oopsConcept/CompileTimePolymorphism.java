package com.oopsConcept;

/*------------------------------------------Method OVERLOADING---------------------------------------*/
//OR
/*------------------------------------------Compile Time POLYMORPHISM---------------------------------------*/

//When a method with same name but has different set of arguments is called Method Overloading
//



public class CompileTimePolymorphism
{
	static int a=5;
	static int b=10; 
	static int c=20;	
	
	public void circleShape(int a)
	{
		System.out.println("Radius of Circle is: " +a);
	}
	
	public void squareShape(int a, int b)
	{
		System.out.println("Area of the sqaure is: " +a*b);
	}
	
	public void rectangleShape(int a, int b, int c)
	{
		System.out.println("Area of the rectangle is: " +a*b*c);
	}
		
	public static void main(String[] args) 
	{
		CompileTimePolymorphism poly = new CompileTimePolymorphism();
		poly.circleShape(a);
		poly.squareShape(a, b);
		poly.rectangleShape(a, b, c);	
	}
}



