package scanner_class;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

         System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

       
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area of the triangle
        double area = (base * height) / 2;      //Formula

       
        System.out.println("The area of the triangle is: " + area);

        // Close the scanner
        scanner.close();
    }

	}


