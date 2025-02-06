package scanner_class;

import java.util.Scanner;

public class CircumferenceOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the lengths of the sides of the triangle
        System.out.println("Enter the length of side A:");
        double sideA = scanner.nextDouble();

        System.out.println("Enter the length of side B:");
        double sideB = scanner.nextDouble();

        System.out.println("Enter the length of side C:");
        double sideC = scanner.nextDouble();

        // Calculate the circumference
        double circumference = sideA + sideB + sideC;

        // Display the result
        System.out.println("The circumference of the triangle is: " + circumference);

        // Close the scanner
        scanner.close();
    }
	}


