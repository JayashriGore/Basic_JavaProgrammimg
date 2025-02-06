package setPropertise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetToSet_StringValues {

	public static void main(String[] args) {
		Set<String> s1=	new HashSet<String>();
		
		// Adding elements to the HashSet
        s1.add("Apple");
        s1.add("Banana");
        s1.add("Cherry");
        s1.add("Apple");  // Duplicate value, won't be added

        // Displaying the HashSet after adding elements
        System.out.println("HashSet after adding elements: " + s1);

        // Checking if an element exists in the HashSet
        boolean containsApple = s1.contains("Apple");
        System.out.println("Does the set contain 'Apple'? " + containsApple);

        // Removing an element from the HashSet
        s1.remove("Banana");
        System.out.println("HashSet after removing 'Banana': " + s1);

        // Checking the size of the HashSet
        int size = s1.size();
        System.out.println("Size of the HashSet: " + size);

        // Iterating through the HashSet
        System.out.println("Iterating through the HashSet:");
        for (String fruit : s1) {
            System.out.println(fruit);
        }

        // Clearing all elements from the HashSet
        s1.clear();
        System.out.println("HashSet after clearing: " + s1);

        // Checking if the HashSet is empty
        boolean isEmpty = s1.isEmpty();
        System.out.println("Is the HashSet empty? " + isEmpty);
	          

	}

}
