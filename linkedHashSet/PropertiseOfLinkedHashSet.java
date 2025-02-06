package linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class PropertiseOfLinkedHashSet {

	public static void main(String[] args) 
	{
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("Jiya"); //Not followig Indexing and Ordr of Insertion
		set.add("Abhay");
        set.add("Baban");
        set.add("Cherry");
        set.add("Siya"); 
        set.add("Siya"); // Duplicate, will not be added
        set.add(null); /// allows only one null
        set.add(null);
        
         System.out.println(set);  
         System.out.println("Iterating through HashSet:");
         Iterator<String> iterator = set.iterator();
         while (iterator.hasNext()) 
         {
             System.out.println(iterator.next());
         }
    }

}
