package com.Polymorphism;

/*------------------------------------------Method OVERRIDING---------------------------------------*/
//OR
/*------------------------------------------Run Time  POLYMORPHISM---------------------------------------*/
//
//

public class RunTimePolymorphism
{
	static int salary = 5000;
	static class ContractEmployee
	{
		
		public int Salary()
		{
			return salary;
		}
	}
	
	static class PermanentEmployee extends ContractEmployee
	{
		public int Salary()
		{
			return salary+1800+200;
		}
	}
	
		public static void main(String[] args) 
		{
			PermanentEmployee pe = new PermanentEmployee();
		int sal = pe.Salary();
			
			System.out.println("Salary of Permanent Employee is: " +sal);			
		}
}



