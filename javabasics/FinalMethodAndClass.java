package javabasics; 

     class MainClass                                               // make it final Final class MainClass see the error in front of extend keyword
{
	
	               final void add()
	{
		System.out.println(" Do addition with 2 numbers"); 
	}
}
public class FinalMethodAndClass extends MainClass
{
	
	//void add()	 check final method
	{
		
		System.out.println(" Do addition with 3 numbers"); 
		//super.add();    	
	}
	public static void main(String[] args) {
		
		FinalMethodAndClass  s1 = new FinalMethodAndClass(); 
		
            s1.add();                      ///child class calling
         
}
	
	}
