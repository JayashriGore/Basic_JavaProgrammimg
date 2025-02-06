package javabasics;

class SuperClass
{
	
	 void add()
	{
		System.out.println(" Do addition with 2 numbers"); 
	}
}
public class SuperKeyword extends SuperClass
{
	
	void add()	
	{
		
		System.out.println(" Do addition with 3 numbers"); 
		super.add();    	
	}
	public static void main(String[] args) {
		
		SuperKeyword  s1 = new SuperKeyword();
		
            s1.add();                      ///child class calling
         
}
	
	}

