package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class MethodsOfHashSet {

	public static void main(String[] args) 
	{
		// Adding elements to the HashSet
		HashSet<Integer> s1 = new HashSet<>();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(50);
        System.out.println("HashSet: " + s1);

        
         System.out.println(s1.contains(30)); // Checking if an element exists

        // Removing an element from the HashSet
        s1.remove(40);
        System.out.println("HashSet after removing 40: " + s1);

        // Checking the size of the HashSet
       
        System.out.println(s1.size());

        // Checking if the HashSet is empty
        boolean isEmpty = s1.isEmpty();
        System.out.println("Is the HashSet empty? " + isEmpty);

        // Clearing all elements from the HashSet
        s1.clear();
        System.out.println(s1);

        // Adding elements again
        s1.add(60);
        s1.add(70);
        s1.add(80);

        // Iterating over the HashSet
        System.out.println("Iterating through HashSet:");
        Iterator<Integer> iterator = s1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using forEach method (Java 8 and above)
        System.out.println("Using forEach method to print HashSet:");
        s1.forEach(element -> System.out.println(element));

	}

}
