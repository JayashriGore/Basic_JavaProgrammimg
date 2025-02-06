package string_class;

import java.util.Arrays;
import java.util.Scanner;

public class CreateaArrayOfsize4ofStringDatatype_ExcepInputUsingScannerClass 

    {                                //Program for Create a ArrayOfsize4 of StringDatatype and Except it Input Using Scanner Class 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1 = new Scanner(System.in);
		int roll[]=new int[3];
		for(int i=0 ;i<roll.length;i++)
		{
			System.out.println("Please Enter the value at index--> "+i);
			roll[i]=s1.nextInt();
		}
		
		//roll[0]=s1.nextInt();
		//roll[1]=s1.nextInt();
		//roll[2]=s1.nextInt();
		System.out.print("The new Array at run time is -->");
		System.out.println(Arrays.toString(roll));
		
		
		

	}

}
