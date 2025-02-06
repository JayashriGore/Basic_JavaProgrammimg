package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class PropertiseOfHashSet {

	public static void main(String[] args) 
	{
		HashSet<String> h1 = new HashSet<>();
        h1.add("Ajay");         //Not follow Indexing
        h1.add("Bidya");
        h1.add("chhaya");
        h1.add("Diya");
        h1.add("Diya");  // Duplicate, won't be added
        System.out.println(h1);
        h1.add(null);
        System.out.println(h1); // Allow only one null value
        
        
       Iterator<String> iterator = h1.iterator();
        // Iterating over the set
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        
        
                         
        
	}

	}
}
