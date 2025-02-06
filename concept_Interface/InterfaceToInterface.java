package concept_Interface;

public class InterfaceToInterface {
	
	
	interface api1
	{
		void show();  // Abstract method
		
	    void display(); // Abstract method
	  
	}
	interface api2 extends api1
	{
		void print();
	
	}

}
