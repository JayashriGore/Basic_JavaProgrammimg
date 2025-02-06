package javabasics;

public class NonStatic_Method {
	
  void add()
  {
	  
	  System.out.println("Addition.........");
  }
  void sub()
  {
	  
	  System.out.println("subtraction.........");
  }
  void mul()
  {
	  
	  System.out.println("Multiplication.........");
  }
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStatic_Method n1=new NonStatic_Method();
		//This is syntax of create an object
		n1.add();
		n1.sub();
		n1.mul();

		
		
	}

}
