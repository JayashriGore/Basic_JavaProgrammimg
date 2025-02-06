package javabasics;
  
                                      //Parameterized 
class StudentX

{
	  StudentX(String name)
	  
	  {
		  
		  System.out.println("3");
			
	  }
}
  class StudentY extends StudentX
  
  {
  	  StudentY()
  	  
  	  
  	  
  	  {
  		super("MKT");   // Parameret-It is calling his parent means line no 7
  		  
  		  System.out.println("2");
  			
  	  }
  }



public class SuperCallingStatement3 extends StudentY 
{
	SuperCallingStatement3()
	{
		super();
		System.out.println("1");
			
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperCallingStatement3 s1 = new SuperCallingStatement3();
		

	}

}
