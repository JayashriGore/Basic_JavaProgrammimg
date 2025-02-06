package list_Propertise;

import java.util.ArrayList;
import java.util.List;

public class ListProp_RetainAll {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList<String>();
        l.add("Ajay");               
        l.add("Akshay");
        l.add("Amol");
        l.add("Ankit"); 
        
        List<String> l2=new ArrayList<String>();
        l2.add("Ajay");               
        l2.add("Akshay");
        l2.retainAll(l);    // Retains?
        System.out.println(l2);
		
		//List<String> list1 = new ArrayList<>();
		//list1.add("apple");
		//list1.add("banana");
		//list1.add("cherry");

		//List<String> list2 = new ArrayList<>();
		//list2.add("banana");
		//list2.add("cherry");

		//list1.retainAll(list2);  // Retains only "banana" and "cherry"
		//System.out.println(list1);  // Output: [banana, cherry]
		}
	}
