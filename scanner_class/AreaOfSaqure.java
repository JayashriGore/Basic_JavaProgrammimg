package scanner_class;

import java.util.Scanner;

public class AreaOfSaqure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the side length of the square
        System.out.print("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();

        // Calculate the area of the square
        double area = sideLength * sideLength;

        // Display the result
        System.out.println("The area of the square is: " + area);

        // Close the scanner
        scanner.close();
    }

	}


