package javabasics;  

// This is for non Parameterized Constructor example

class Class3 
{
	
	Class3()
	
	{
		System.out.println(" Constructor3");
	
	}
	}

class Class2 extends  Class3
{
	
	Class2() 
	
	{
		super();//calling class 3 constructor
		System.out.println(" Constructor2");
	}
	}
	
	
	public class SuperCallingStatment1 extends Class2
	{

	SuperCallingStatment1()
		
		{
			super(); //calling class 2 constructor
			System.out.println(" Constructor1");
		}
		
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub 

			new SuperCallingStatment1(); // it calls SuperCallingStatment1() constructor line no 32
			
		}
		
	}


