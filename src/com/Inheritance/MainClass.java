package com.Inheritance;

import com.Inheritance.HierarchicalInheritance.H2;
import com.Inheritance.HierarchicalInheritance.H3;
import com.Inheritance.MultilevelInheritance.M3;
import com.Inheritance.SimpleInheritance.S2;

public class MainClass 
{
	public static void main(String[] args) 
	{
		/*S2 s2 = new S2();
		s2.substraction();
		
		M3 m3 = new M3();
		m3.mul();*/
		
		H3 h3 = new H3();
		h3.square();
		
		H2 h2 = new H2();
		h2.rem();
		
	}
}