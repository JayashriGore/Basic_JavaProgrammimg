package exception_Handling;

public class FinallyKeyword_Block {

	public static void main(String[] args) 
	{
	try{
		int a=1/1; // Execute Catch block and if int a=1/0;-execute the try block
		System.out.println(a);
	}
	catch (ArithmeticException e)
    {
	 System.out.println("Handled the exception");
    }
	finally 
	{
		System.out.println("Closing the connection with database");	
	}
}

}
