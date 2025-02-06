package javabasics;

  class Student1
 
{
	  Student1()             // Non Parameterized
	  
	  {
		  
		  System.out.println("3");
			
	  }
}
  class Student2 extends Student1
  
  {
  	  Student2()
  	  
  	  
  	  
  	  {
  		super();
  		  
  		  System.out.println("2");
  			
  	  }
  }



public class SuperCallingStatment2 extends Student2 
{
	SuperCallingStatment2()
	{
		super();
		System.out.println("1");
			
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperCallingStatment2 s1 = new SuperCallingStatment2();
		

	}

}
