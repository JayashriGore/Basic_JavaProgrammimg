package concept_Interface;                    //Multilevel example                
  interface Google_auth
   {
	  void add();
	  
	  void subtract();
   }
  abstract class Amazon_2 implements Google_auth
  
  {
	  abstract void cart();
	  static void wishlist() 
	  
	  {
		  System.out.println(" Exposing some logic");  
		  
	  }
	  
  }
  

public class Amazon_1 extends Amazon_2 
{

	public static void main(String[] args) 
	{
		Amazon_1 a1= new Amazon_1();
		
		a1.add();
		a1.subtract();
		a1.cart();
	}

	@Override 
	public void add() 
	{
		
		System.out.println(" Addition");  
	}

	@Override
	public void subtract() 
	{
		System.out.println(" subtraction");  
		
	}

  void cart() 
  {
	  System.out.println(" Add item in cart");  
	}

}
