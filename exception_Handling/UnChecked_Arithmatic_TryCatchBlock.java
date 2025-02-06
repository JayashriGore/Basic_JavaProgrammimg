package exception_Handling;

public class UnChecked_Arithmatic_TryCatchBlock {

	public static void main(String[] args) 
	{
		   System.out.println("1");
		   System.out.println("2");
		   System.out.println("3");
		   try 
			{
		   System.out.println(100/0);
		   } 
		   catch (ArithmeticException e)
		    {
			 System.out.println("Anthing divide by zero not possible");
		    }
	}

}
