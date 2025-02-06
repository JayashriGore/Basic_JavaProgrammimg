package scanner_class;

import java.util.Scanner;

public class CircumferenceOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the circumference
        double circumference = 2 * Math.PI * radius;

        // Display the result
        System.out.println("The circumference of the circle is: " + circumference);
        
        // Close the scanner
        scanner.close();
    }

	}

