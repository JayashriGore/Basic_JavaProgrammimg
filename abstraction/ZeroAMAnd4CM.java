package abstraction;

//Abstract class with 4 concrete methods
abstract class MyAbstractClass {

// Concrete method 1
public void method1() {
   System.out.println("This is method 1.");
}

// Concrete method 2
public void method2() {
   System.out.println("This is method 2.");
}

// Concrete method 3
public void method3() {
   System.out.println("This is method 3.");
}

// Concrete method 4
public void method4() {
   System.out.println("This is method 4.");
}
}

//Concrete class extending the abstract class
class MyConcreteClass extends MyAbstractClass {

// The concrete class can call all the concrete methods from the abstract class
public void callMethods() {
   method1();
   method2();
   method3();
   method4();
}
}

public class ZeroAMAnd4CM {
public static void main(String[] args) {
   MyConcreteClass obj = new MyConcreteClass();
   obj.callMethods(); // Calling all the concrete methods
}
}







