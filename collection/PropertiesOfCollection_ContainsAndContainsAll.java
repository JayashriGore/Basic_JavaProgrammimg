package collection;

import java.util.ArrayList;
import java.util.Collection;

public class PropertiesOfCollection_ContainsAndContainsAll {

	public static void main(String[] args) 
	{
		Collection<Integer> c1=new ArrayList<Integer>();
		c1.add(987);
		c1.add(788900);
		c1.add(8765);
		c1.add(45);
		c1.add(6);
		c1.add(46);
		System.out.println(c1); 
		
		
		Collection<Integer> c2=new ArrayList<Integer>();
		c2.add(11);
		//System.out.println(c2.contains(900)); false
		System.out.println(c2.contains(11)); //True
		
	
		//ContainsAll
		c2.addAll(c1);    // Ad C1 in C2
		System.out.println(c2.containsAll(c1)); //True //false ifc2.addc1 will not there
		
		
		
		
		
		
		
	}

}
