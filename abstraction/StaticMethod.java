package abstraction;
// Abstract class
	abstract class Animal {
	   
	    abstract void sound();

	    // Static method in an abstract class
	    public static void staticMethod() {
	        System.out.println("This is a static method in the abstract class.");
	    }
	}

	// Concrete class that extends the abstract class
	class Dog extends Animal {
	    @Override
	    void sound() {
	        System.out.println("The dog barks.");
	    }
	}

	public class StaticMethod {
	    public static void main(String[] args) {
	        // Call the static method from the abstract class directly
	        Animal.staticMethod();

	        // Create an object of the Dog class and call the non-static method
	        Animal myDog = new Dog();
	        myDog.sound(); 
	    }
	}


	


