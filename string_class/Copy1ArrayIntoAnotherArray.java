package string_class;

import java.util.Arrays;

public class Copy1ArrayIntoAnotherArray {

	public static void main(String[] args) 
	{
		int input[] = new int [5];
		input[0]=101;  
	    input[1]=100;
	    input[2]=99;
	    input[3]=98;
	    input[4]=97;
	    
	    int output[] = new int [input.length];  // or [5]
	    for (int i=0,j=0;i<input.length;i++,j++)  
	    {
	    output[j]=input[i];
	    }
          System.out.println("The input array is-->"+Arrays.toString(input));
	    System.out.println("The Copied arrray is-->"+Arrays.toString(output));
	    

	}

}
