package pro_ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListOf_Iterator {

	public static void main(String[] args) 
	{
		ArrayList<String> l = new ArrayList<>();
		l.add("Amit");               
		l.add("Amit");               
        l.add("Akshay");
        l.add("Nisha");
        l.add("Nupur");                
        System.out.println(l);
        
        ListIterator<String> ll=l.listIterator();
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
