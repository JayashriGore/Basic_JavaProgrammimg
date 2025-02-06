package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionAcceptNullORDuplicate_Or1nullAnd2Null_POC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		c2.add(11); //-Duplicate
		//System.out.println(c2.contains(900)); false
		System.out.println(c2.contains(11)); //True
		
	
		//ContainsAll
		c2.addAll(c1);    // Ad C1 in C2
		System.out.println(c2.containsAll(c1)); //True //false ifc2.addc1 will not there
		
		
		//Accepting 1 Null and 2 Null?
		c2.add(null);      
		c2.add(null);
		System.out.println(c2); 
		
		
		

	}

}
