package list_Propertise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListProp_ForwardAndBackward_Iteration {

	public static void main(String[] args) 
	{
		List<String>l=new ArrayList<String>();
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
