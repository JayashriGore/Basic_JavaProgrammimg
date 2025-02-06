package scanner_class;

import java.util.Scanner;

public class CircumferanceofSquare 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the side length of the square
        System.out.print("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();

        // Calculate the circumference
        double circumference = 4 * sideLength;

        // Display the result
        System.out.println("The circumference of the square is: " + circumference);

        // Close the scanner
        scanner.close();
    }

	}


