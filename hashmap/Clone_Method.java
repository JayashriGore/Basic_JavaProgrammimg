package hashmap;

import java.util.HashMap;

public class Clone_Method {

	public static void main(String[] args) 
	{
		HashMap<String, Integer> originalMap = new HashMap<>();
        originalMap.put("One", 1);
        originalMap.put("Two", 2);
        originalMap.put("Three", 3);
        
        // Clone the original map
        HashMap<String, Integer> clonedMap = (HashMap<String, Integer>) originalMap.clone();
        
        // Display both original and cloned maps
        System.out.println("Original HashMap: " + originalMap);
        System.out.println("Cloned HashMap: " + clonedMap);
        
        // Modify the cloned map
        clonedMap.put("Four", 4);
        
        // Display maps after modification
        System.out.println("\nAfter modifying the cloned map:");
        System.out.println("Original HashMap: " + originalMap);
        System.out.println("Cloned HashMap: " + clonedMap);

	}

}
