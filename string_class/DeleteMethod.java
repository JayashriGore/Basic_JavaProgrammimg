package string_class;

public class DeleteMethod 
{
public static void main(String[] args) 
	{
		String s1 = "Hello, World!";
		String result = s1.substring(0, 5);  // Keeps only "Hello"
		System.out.println(result);                // Output: "Hello"    
		
		//OR
		
		StringBuffer s2 = new StringBuffer("Jayashri Gore");
		System.out.println(s2.deleteCharAt(9)); 
		
		 
		
		
		
		


	}

}
