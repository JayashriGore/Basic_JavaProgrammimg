package string_class;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysEqualsorNot_RunTime {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		int roll[]=new int[3];
		for(int i=0 ;i<roll.length;i++)
		{
			System.out.println("Please Enter the value at index--> "+i);
			roll[i]=s1.nextInt();
		}
		
		int roll1[]=new int[3];
		for(int i=0 ;i<roll.length;i++)
		{
			System.out.println("Please Enter the value at index--> "+i);
			roll1[i]=s1.nextInt();
		}
		
		 boolean answer = Arrays.equals(roll, roll1);
			System.out.println(answer);
		
		

	}

}
