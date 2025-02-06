package exception;

import java.util.Scanner;

public class UnChecked_InputMismatchAndNgativeArraySize {

	public static void main(String[] args) 
	{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the size of your array");
	int rollno[] = new int[s1.nextInt()];     // Enter -value =NegativeArraySizeException
	                                          // Enter Jayashri =InputMismatchException
                                             // 
	}

}
