package abstraction;                      // Program child class extends 2 abstract classes with abstract,concrete methods
abstract class Amazon_1
{
	abstract void login();  //needs to be overridden
	abstract void logout(); // needs to be overridden
	
	void address() // It can be overridden
    {
		System.out.println(" Hi I am non static method1"); 
    }
	
   static void payment()  // Can not overridden (Because its static method)
   {
	   
   }
   

}
  abstract class Amazon_2 extends Amazon_1 
{
	abstract void twowayauth(); // needs to be overridden
	abstract void otp();       // needs to be overridden
     void cart() // It can be overridden
    {
	   
    }
	
   static void addtowishlist()  // Can not be overridden 
   {
	   System.out.println(" Hi I am non static method2"); 
   }
   
}

public class Amazon_Program extends Amazon_2
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Amazon_Program a1 = new Amazon_Program();
		
	   a1.login();
	   a1.logout();
	   a1.address();
	   a1.twowayauth();
	   a1.otp();
	   a1.cart();
		

	}

	
	void twowayauth() {
		// TODO Auto-generated method stub
		System.out.println(" Hi I abstract method1 of class Amazon2"); 
		
	}

	
	void otp() {
		// TODO Auto-generated method stub
		System.out.println(" Hi I abstract method1 of class Amazon2"); 
		
	}

	void login() 
	{
		System.out.println(" Hi I abstract method1 of class Amazon1"); 
	}

	
	void logout() 
	{
		// TODO Auto-generated method stub
		System.out.println(" Hi I abstract method1 of class Amazon1"); 
		
	}

}
