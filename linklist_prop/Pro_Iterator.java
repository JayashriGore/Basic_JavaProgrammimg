package linklist_prop;

import java.util.Iterator;
import java.util.LinkedList;

public class Pro_Iterator {

	public static void main(String[] args) {
		LinkedList<String> s1 = new LinkedList<>();
		s1.add("Amit");               
        s1.add("Akshay");
        s1.add("Nisha");
        s1.add("Nupur");                
        System.out.println(s1);
        
        Iterator<String> ite=s1.iterator();
        
        while(ite.hasNext()) 
        {
        	
        	System.out.println(ite.next());	
        }
        
        
		

	}

}
