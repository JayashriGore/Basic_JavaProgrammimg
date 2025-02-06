package scanner_class;

import java.util.Scanner;

public class Mul2Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// Create a Scanner object to read input
        Scanner s1 = new Scanner(System.in); //To invoke the constructor

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int a= s1.nextInt();

        System.out.print("Enter the second number: ");
        int b= s1.nextInt();
        // multiplication of two numbers
        int mul = a*b;

        // Display the result
        System.out.println(mul);

        // Close the scanner to avoid resource leak
        s1.close();
	}

	}



