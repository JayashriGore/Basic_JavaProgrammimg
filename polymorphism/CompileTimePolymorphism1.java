package polymorphism;
class MathOperations {
    
    // Method with one parameter
    void add(int a) {
        System.out.println("Addition with one number: " + (a + 10));
    }

    // Method with two parameters
    void add(int a, int b) {
        System.out.println("Addition of two numbers: " + (a + b));
    }

    // Method with three parameters
    void add(int a, int b, int c) {
        System.out.println("Addition of three numbers: " + (a + b + c));
    }

    // Method with different parameter types
    void add(double a, double b) {
        System.out.println("Addition of two double numbers: " + (a + b));
    }
}

public class CompileTimePolymorphism1 {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();

        // Calling overloaded methods
        obj.add(5);
        obj.add(10, 20);
        obj.add(5, 10, 15);
        obj.add(3, 4);
    }
}