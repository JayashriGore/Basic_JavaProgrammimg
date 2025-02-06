package concept_Interface;
//Step 1: Define an Interface
interface Animal {
 // Abstract method (no implementation)
 void sound();
 
 // Default method (optional implementation)
 default void breathe() {
     System.out.println("Breathing...");
 }
}

//Step 2: Define an Abstract Class
abstract class Mammal implements Animal {
 // Concrete method
 public void walk() {
     System.out.println("Walking...");
 }

 // Abstract method (must be implemented by concrete subclass)
 public abstract void sound(); 
}

//Step 3: Define a Concrete Class
class Dog extends Mammal {
 // Implementing the abstract method from Mammal (and Animal)
 public void sound() {
     System.out.println("Barking...");
 }

 // Optionally overriding the default method from Animal
 public void breathe() {
     System.out.println("Dog is breathing...");
 }
}

//Main class to test the implementation
public class ClassToAbClassToInterface {
 public static void main(String[] args) {
     Dog dog = new Dog();
     
     // Calling methods from Dog
     dog.sound();        // From the Dog class
     dog.walk();         // From the Mammal abstract class
     dog.breathe();      // Overridden method in Dog class
 }
}





















