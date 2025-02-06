package setPropertise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Itreration_ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s1=	new HashSet<Integer>();
		s1.add(45);
		s1.add(85);
		s1.add(15);
		s1.add(99);
		System.out.println(s1);
		System.out.println("O/P After Iteration");
				
	  Iterator<Integer> i1= s1.iterator();
		      while(i1.hasNext())
		  System.out.println(i1.next());
		}

	}


