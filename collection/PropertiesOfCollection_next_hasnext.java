package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PropertiesOfCollection_next_hasnext {

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
		
		Iterator<Integer> i1= c1.iterator(); // 
		
		System.out.println("Iterating through-->"); 
		
		while (i1.hasNext())
		{
			System.out.println(i1.next()); 
		}
		

	}

}
