package abstraction;

abstract class Amazon_X
{
	abstract void login();  //needs to be overridden
	abstract void logout(); // needs to be overridden
	abstract void output(); // needs to be overridden
	
	void address() // It can be overridden
    {
		System.out.println(" Hi I am non static method1"); 
    }
	
   static void payment()  // Can not overridden (Because its static method)
   {
	   
   }
   

}
  abstract class Amazon_Y extends Amazon_X 
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

public class ThreeAMAnd1CM  extends Amazon_Y
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreeAMAnd1CM  a1 = new ThreeAMAnd1CM ();
		
	   a1.login();
	   a1.logout();
	   a1.output();
	   a1.address();
	   a1.twowayauth();
	   a1.otp();
	   a1.cart();
		

	}

	
	void twowayauth() {
		// TODO Auto-generated method stub
		System.out.println(" Hi I abstract method1 of class AmazonY"); 
		
	}

	
	void otp() {
		// TODO Auto-generated method stub
		System.out.println(" Hi I abstract method1 of class AmazonY"); 
		
	}

	void login() 
	{
		System.out.println(" Hi I abstract method1 of class AmazonX"); 
	}

	
	void logout() 
	{
		// TODO Auto-generated method stub
		System.out.println(" Hi I abstract method1 of class AmazonX"); 
		
	}


	@Override
	void output() {
		// TODO Auto-generated method stub
		
		System.out.println(" Hi I abstract method3 of class AmazonX"); 
		
	}




	
	}


