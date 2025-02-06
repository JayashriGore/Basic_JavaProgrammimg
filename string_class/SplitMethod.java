package string_class;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) 
	{
		String input = "Jayashri Rajabapu Gore";
		String [] s2=   input.split(" ");
		System.out.println(Arrays.toString(s2));
		//String [] s1=   input.split(" ",1);
		//String [] s4=   input.split(" ",2);
		String [] s3=   input.split(" ",2 );
		///System.out.println(Arrays.toString(s1));
		//System.out.println(Arrays.toString(s4));
		System.out.println(Arrays.toString(s3));
		

	}

}
