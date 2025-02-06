package linkedHashSet;

import java.util.LinkedHashSet;

public class MethodsOFLinkeHashset 
{
	public static void main(String[] args) {

	      LinkedHashSet<String> set = new LinkedHashSet<>();

		        // Adding elements to the LinkedHashSet
		        set.add("Apple");
		        set.add("Banana");
		        set.add("Cherry");
		        set.add("Date");
		        set.add("Elderberry");

		        System.out.println(set);

		        // Checking if an element is present
		        System.out.println("Does set contain 'Banana'? " + set.contains("Banana"));

		        // Removing an element
		        set.remove("Cherry");
		        System.out.println("After removing 'Cherry': " + set);

		        // Checking the size of the LinkedHashSet
		        System.out.println("Size of LinkedHashSet: " + set.size());

		        // Checking if the set is empty
		        System.out.println("Is the set empty? " + set.isEmpty());

		        // Iterating through the LinkedHashSet using for-each loop
		        System.out.println("Iterating using for-each loop:");
		        for (String fruit : set) {
		            System.out.println(fruit);
		        }

		        // Adding all elements from another collection
		        LinkedHashSet<String> newSet = new LinkedHashSet<>();
		        newSet.add("Fig");
		        newSet.add("Grape");
		        set.addAll(newSet);
		        System.out.println("After adding all elements from another set: " + set);

		        // Retaining only the common elements (intersection) with another set
		        LinkedHashSet<String> retainSet = new LinkedHashSet<>();
		        retainSet.add("Banana");
		        retainSet.add("Grape");
		        set.retainAll(retainSet);
		        System.out.println("After retaining common elements: " + set);

		        // Removing all elements from the LinkedHashSet
		        set.clear();
		        System.out.println("After clearing all elements: " + set);

		        // Checking if the set is empty after clearing
		        System.out.println("Is the set empty now? " + set.isEmpty());
		    }
		}


