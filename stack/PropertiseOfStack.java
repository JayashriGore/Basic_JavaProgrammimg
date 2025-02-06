package stack;

import java.util.Stack;

public class PropertiseOfStack {

	public static void main(String[] args) {
		Stack<Integer> s1=new Stack<Integer>();
		s1.add(11);
		s1.add(12);
		s1.add(13);
		s1.add(14);
		s1.add(15);
		s1.add(16);
		s1.add(17);
		//System.out.println(s1);
		
	   s1.pop();
	   System.out.println(s1); // pop last value out/Remove first 
	   
	  
	   System.out.println("The element at the top of the"    
               + " stack is: " + s1.peek());              // looks last object
	   
	   s1.push(17);
	   System.out.println(s1);             //adding element
	  
	   
	   

	   
	}
		
	}


