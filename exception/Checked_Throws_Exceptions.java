package exception;

public class Checked_Throws_Exceptions 
{
public static void main(String[] args) throws ArrayIndexOutOfBoundsException,NullPointerException
	{
		if(2==1)//1==1
		{
			throw new ArrayIndexOutOfBoundsException("Size is less");  //Dead codeif 2==1
		}                                                               //only this code executr depends on condition
		else
		{
			throw  new NullPointerException("Cell is empty");//Dead codeif 1==1 
		}

	}
}


