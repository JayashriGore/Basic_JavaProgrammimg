package treeset;

import java.util.TreeSet;

public class MethodsOfTreeSet {

	public static void main(String[] args) 
	{

		  TreeSet<Integer> s1 = new TreeSet<>();
                            // Add Method
	        s1.add(10);
	        s1.add(20);
	        s1.add(30);
	        s1.add(5);
	        s1.add(7);
	        
	        System.out.println(s1);
	        s1.remove(7);
	        System.out.println(s1);
	        
	        System.out.println(s1.contains(5));
	        System.out.println("Size: " + s1.size());
	        
	     // Iterating over the elements
	        for (Integer number : s1) {
	            System.out.println(number);
	        }
	        System.out.println("Before first and last method");
	        System.out.println( s1.first()); //Returns the first (lowest) element in the set.
	        System.out.println(s1.last()); //Returns the last (highest) element in the set.
	        
	        
	        TreeSet <Integer>treeset = new TreeSet<>();

	        // adding in the tree set
	        treeset.add(12);
	        treeset.add(11);
	        treeset.add(16);
	        treeset.add(15);

	        //method is used to return the least element in this set greater than or equal to the given element, or null if there is no such element.
	        System.out.println("Ceiling value for 13: "+treeset.ceiling(13));
	
	
	
	}
}
