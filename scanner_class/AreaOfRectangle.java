package scanner_class;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

         System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate the area
        double area = length * width;

        
        System.out.println("The area of the rectangle is: " + area);

        // Close the scanner
        scanner.close();
    }

	}


