package string_class;

import java.util.Arrays;

public class ToPrintArrayInReverseOrder 
{
	public static void main(String[] args) 
{
		int input[] = new int [5];
				input[0]=101;  
			    input[1]=100;
			    input[2]=99;
			    input[3]=98;
			    input[4]=97;
			    
			    int output[] = new int [input.length];  // or [5]
			    for (int i=0,j=input.length-1;i<input.length;i++,j--)  // or j=4
			    {
			    output[j]=input[i];
			    }
		          System.out.println("The input array is-->"+Arrays.toString(input));
			    System.out.println("The output arrray is-->"+Arrays.toString(output));
			    
			    
		
		
		//OR
		//int input[] = new int [3];
		//input[0]=101;  //[]
	    //input[1]=100;
	    //input[2]=99;
	     
	    //int output[] = new int [3];
	    //output[2]=101;
	    //output[1]=100;
	    //output[0]=99;
	    //System.out.println(Arrays.toString(input));
	    //System.out.println(Arrays.toString(output));
	    
	    
	    
	    
				
		

	}


}
