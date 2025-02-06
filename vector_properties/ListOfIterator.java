package vector_properties;

import java.util.ListIterator;
import java.util.Vector;

public class ListOfIterator {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();
		v1.add("Amit");               
        v1.add("Akshay");
        v1.add("Nisha");
        v1.add("Nupur");                
        System.out.println(v1);
        
        ListIterator<String> ll=v1.listIterator();
        System.out.println("Forward Iteration using List Iterator-->");
        
        while(ll.hasNext()) 
        {
        	System.out.println(ll.next());
        }
        System.out.println("Backward Iteration using List Iterator-->");
        
        while(ll.hasPrevious())
        {
        	System.out.println(ll.previous());
        }
        

	}

}
