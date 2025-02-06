package exception;

public class UnChecked_ArithmaticException 
{

	public static void main(String[] args) 
	{
		   System.out.println("1");
		   System.out.println("2");
		   System.out.println("3");
		   System.out.println(100/0); // Anything dived by zero = Infinity
		                                // throwing ArithmeticException
	}

}
