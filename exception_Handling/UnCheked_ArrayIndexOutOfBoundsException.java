package exception_Handling;

public class UnCheked_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) 
	{
		try {
		int rollno[]=new int [3];
		rollno[0]=45;
		rollno[1]=74;
		rollno[2]=23;
		rollno[3]=25;
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("Logic");
		}
		catch(NullPointerException a2 )
		{
			System.out.println("input should not blank");
		}
		catch(NegativeArraySizeException a3 )
		{
			System.out.println("Enter positive value only");
		}
		
	}

}
