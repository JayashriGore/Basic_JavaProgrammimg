package scanner_class;

import java.util.Scanner;

public class CircumferenceOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        // Prompt the user for the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate the circumference (perimeter) of the rectangle
        double circumference = 2 * (length + width);

        // Display the result
        System.out.println("The circumference of the rectangle is: " + circumference);

        // Close the scanner
        scanner.close();
    }
	}


