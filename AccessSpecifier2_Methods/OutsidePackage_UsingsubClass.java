package AccessSpecifier2_Methods;          //Case3

import AccessSpecifier_Methods.ABC;

public class OutsidePackage_UsingsubClass extends ABC
{

  public static void main(String[] args) 
  {
		
     ABC.addition();        
     ABC.substraction();
     
     OutsidePackage_UsingsubClass o1= new OutsidePackage_UsingsubClass();
     o1.method1();
     o1.method2();
     
     

	}

}

