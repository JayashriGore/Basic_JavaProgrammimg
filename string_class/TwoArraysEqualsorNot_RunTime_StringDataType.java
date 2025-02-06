package string_class;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysEqualsorNot_RunTime_StringDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s2 = new Scanner(System.in);
		String name []=new String[3];
		for(int i=0 ;i<name.length;i++)
		{
			System.out.println("Please Enter the value at index--> "+i);
			name[i]=s2.next();
		}
		
		String name1 []=new String[3];
		for(int i=0 ;i<name.length;i++)
		{
			System.out.println("Please Enter the value at index--> "+i);
			name[i]=s2.next();
		}
        boolean answer = Arrays.equals(name, name1);
			System.out.println(answer);
		

	}

	}

