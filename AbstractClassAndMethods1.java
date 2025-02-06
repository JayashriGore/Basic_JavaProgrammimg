package abstraction;

abstract class Amazon_API                                        //abstract class 
{
   abstract void login();                                        //abstract method1
   abstract void registration();                                 //abstract method2
  
}

 public class AbstractClassAndMethods1 extends Amazon_API {                  //Overridden with the help of extends

	 public static void main(String[] args) 
	 
	 {
	 AbstractClassAndMethods1 a1  = new AbstractClassAndMethods1();
	 
	 a1.login();
	 a1.registration();
	
		
    }
	 
	          void login()
      {
		System.out.println(" Overriding the parent class method1"); 
	  }
              void registration() 
	
	 {
		System.out.println(" Overriding the parent class method2"); 
	 }
	
	
 }


