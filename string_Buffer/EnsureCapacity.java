package string_Buffer;

public class EnsureCapacity {

	public static void main(String[] args) 
	{
		 // To check the minimum capacity StringBuffer that you want 
	    StringBuffer s1 = new StringBuffer();
	    System.out.println(s1.capacity());
	    
		StringBuffer s2 = new StringBuffer("Jayashri Gore");
		
		//method in the StringBuffer class in Java is used to ensure that the StringBuffer has at least the specified capacity to hold characters.
	    s2.ensureCapacity(50);
	    System.out.println("Capacity after ensureCapacity(50): " + s2.capacity());
	    
	   
	}

}
