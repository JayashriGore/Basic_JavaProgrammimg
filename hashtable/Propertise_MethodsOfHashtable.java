package hashtable;

import java.util.Hashtable;
import java.util.Enumeration;

public class Propertise_MethodsOfHashtable 
{

    public static void main(String[] args) {
        
        // Create a Hashtable
        Hashtable<String, String> hashtable = new Hashtable<>();
        
        // Adding key-value pairs using put() method
        hashtable.put("1", "One");
        hashtable.put("2", "Two");
        hashtable.put("3", "Three");
        hashtable.put("4", "Four");
        
        // Printing the hashtable
        System.out.println("Initial Hashtable: " + hashtable);
        
        // Retrieving values using get() method
        String value = hashtable.get("2");
        System.out.println("Value for key '2': " + value);
        
        // Checking if the Hashtable contains a specific key
        boolean containsKey = hashtable.containsKey("3");
        System.out.println("Contains key '3': " + containsKey);
        
        // Checking if the Hashtable contains a specific value
        boolean containsValue = hashtable.containsValue("Four");
        System.out.println("Contains value 'Four': " + containsValue);
        
        // Removing a key-value pair using remove() method
        hashtable.remove("1");
        System.out.println("Hashtable after removing key '1': " + hashtable);
        
        // Checking the size of the Hashtable
        int size = hashtable.size();
        System.out.println("Size of Hashtable: " + size);
        
        // Checking if the Hashtable is empty
        boolean isEmpty = hashtable.isEmpty();
        System.out.println("Is the Hashtable empty? " + isEmpty);
        
        // Enumeration over keys
        Enumeration<String> keys = hashtable.keys();
        System.out.println("Keys in Hashtable:");
        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }
        
        // Enumeration over values
        Enumeration<String> values = hashtable.elements();
        System.out.println("Values in Hashtable:");
        while (values.hasMoreElements()) {
            System.out.println(values.nextElement());
        }
        
        // Clear all entries in the Hashtable
        hashtable.clear();
        System.out.println("Hashtable after clear(): " + hashtable);
        
        // Checking if the Hashtable is empty after clearing it
        isEmpty = hashtable.isEmpty();
        System.out.println("Is the Hashtable empty after clear()? " + isEmpty);
    }
}

	

	
