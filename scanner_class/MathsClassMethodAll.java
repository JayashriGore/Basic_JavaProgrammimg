package scanner_class;

import java.util.Scanner;

public class MathsClassMethodAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a Scanner object for inputt
        Scanner scanner = new Scanner(System.in);
        
        // Math.addExact(int a, int b)
        System.out.print("Enter first integer for addition: ");
        int addNum1 = scanner.nextInt();
        System.out.print("Enter second integer for addition: ");
        int addNum2 = scanner.nextInt();
        System.out.println("Result of addExact: " + Math.addExact(addNum1, addNum2));

        // Demonstrating Math.subExact(int a, int b)
        System.out.print("Enter first integer for subtraction: ");
        int subNum1 = scanner.nextInt();
        System.out.print("Enter second integer for subtraction: ");
        int subNum2 = scanner.nextInt();
        System.out.println("Result of subExact: " + Math.subtractExact(subNum1, subNum2));

        // Demonstrating Math.max(int x, int y)
        System.out.print("Enter first integer to find max: ");
        int maxNum1 = scanner.nextInt();
        System.out.print("Enter second integer to find max: ");
        int maxNum2 = scanner.nextInt();
        System.out.println("Maximum value (int): " + Math.max(maxNum1, maxNum2));

        // Demonstrating Math.max(long x, long y)
        System.out.print("Enter first long to find max: ");
        long maxLong1 = scanner.nextLong();
        System.out.print("Enter second long to find max: ");
        long maxLong2 = scanner.nextLong();
        System.out.println("Maximum value (long): " + Math.max(maxLong1, maxLong2));

        // Demonstrating Math.min(float x, float y)
        System.out.print("Enter first float to find min: ");
        float minFloat1 = scanner.nextFloat();
        System.out.print("Enter second float to find min: ");
        float minFloat2 = scanner.nextFloat();
        System.out.println("Minimum value (float): " + Math.min(minFloat1, minFloat2));

        scanner.close();
    }
        


	}


