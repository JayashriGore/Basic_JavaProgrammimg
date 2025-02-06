package javabasics;


class ParentClass
{
	
	
	void add()
	{
		System.out.println(" Do addition with 2 numbers"); // this method overridden
		
	}
}

public class MethodOverRiding extends ParentClass                                     //child class
{  
	
	
	void add()
	{
		System.out.println(" Do addition with 3 numbers");
		
	}

	
	
	public static void main(String[] args) {
		
		MethodOverRiding  m = new MethodOverRiding();
		
            m.add(); ///child class calling
           // m.add();  again calling child  class
}
	
	}
