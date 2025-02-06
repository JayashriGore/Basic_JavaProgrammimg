package pro_Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class PropertiseOfQueue {

	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<Integer>();
		q1.add(10);               // follow  Indexing
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(40);               // allow Duplicate
        q1.add(50);
        q1.add(null);             //allow Null value
        System.out.println(q1);
        
        Iterator<Integer> ite=q1.iterator();
        
        while(ite.hasNext())             // Iteration is applicable
        {
        	
        	System.out.println(ite.next());	
        }
        
        
       
        
      
       
        
        

	}

}
