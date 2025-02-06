package pro_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class MethosOfQueue {

	public static void main(String[] args) 
	{
		 Queue<Integer> q1 = new LinkedList<>();
	        
	        // Add elements to the queue
	        q1.add(1);
	        q1.add(2);
	        q1.add(3);
	        System.out.println(q1);
	        
	        q1.offer(4);            //This method returns true if the element was added to this queue, else false.
	       // OR
	       //boolean b1= q1.offer(4);
	        System.out.println(q1);
	        
	        //returns and removes the element at the front end of the container. 
	       q1.poll();
	        System.out.println(q1);
	        
	       // returns the element at the front the container. 
	        
	     
	        System.out.println(q1.peek());  // Returms first elememt of the queue if= q is empty retuns flase
	        System.out.println(q1);            // return head of the list represented by this queue, or null if this queue is empty.
	        
	        System.out.println(q1.element()); // same as peek only =throw exceptiom if queeu is empty
	        System.out.println(q1);
	        
	}

}
