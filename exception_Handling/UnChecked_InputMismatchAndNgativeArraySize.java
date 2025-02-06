package exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;              

public class UnChecked_InputMismatchAndNgativeArraySize {

	public static void main(String[] args) {
		                // When you declared inside the block they wont be
			             //recognizable out side the block it will only be recognizable inside the block
			              // * You should never declared veriable inside the block
		
		try
		{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size of your array");
		int rollno[] = new int[s1.nextInt()];  // enter-5
		}
        catch (NegativeArraySizeException n) 
        {
          Scanner s1=new Scanner(System.in);
    	  System.out.println("Enter the size of your array as positive number only");
    	  int rollno[] = new int[s1.nextInt()]; 
        }
		catch (InputMismatchException n1) 
        {
          Scanner s1=new Scanner(System.in);
    	  System.out.println("Please enter only positive values starting from 1");
    	  int rollno[] = new int[s1.nextInt()]; 
        }
	}
}


