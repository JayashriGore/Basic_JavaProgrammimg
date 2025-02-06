package vector_properties;

import java.util.Iterator;
import java.util.Vector;

public class Iterator_listofIterator {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();
		v1.add("Amit");               
        v1.add("Akshay");
        v1.add("Nisha");
        v1.add("Nupur");                
        System.out.println(v1);
        
        Iterator<String> ite=v1.iterator();
        
        while(ite.hasNext()) 
        {
        	
        	System.out.println(ite.next());	
        }
        
        

	}

}
