package treeset;

import java.util.TreeSet;

public class Prop_TreeSet {

	public static void main(String[] args) 
	{
		
		  TreeSet<Integer> s1 = new TreeSet<>();

	        // Adding elements
	        s1.add(10);
	        s1.add(20);
	        s1.add(30);
	        s1.add(5);
	        s1.add(7);
	        
	        System.out.println(s1);// display automatically sorted 
	        System.out.println(s1.contains(20)); // contains method
	        s1.remove(7);
	        System.out.println(s1);   // remove elenent
	        TreeSet<Integer> s2 = new TreeSet<>();
	        s2.add(40);
	        s2.add(50);
	        s2.addAll(s1);
	        System.out.println(s2);
	        s2.removeAll(s1);
	        System.out.println(s2);  
	        
	        
	        
	        
	        
	        

	        
}
}